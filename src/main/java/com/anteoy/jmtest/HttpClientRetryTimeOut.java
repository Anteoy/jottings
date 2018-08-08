package com.anteoy.jmtest;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpRequest;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLException;
import java.io.IOException;
import java.net.UnknownHostException;
/**
 * @auther zhoudazhuang
 * @date 18-8-8 11:24
 * @description
 */
class HttpClientRetryHandlerExample {

  public static void main(String... args) throws IOException {

    int timeout = 2;
    int retry = 5;

    try (CloseableHttpClient httpclient = getInstance(timeout, retry)) {
      HttpGet httpget =
          new HttpGet(
              "http://restapi.amap.com/v3/geocode/geo?address=四川省遂宁市船山区开善寺阳光水岸2单元11楼1号&key=");

      System.out.println("Executing request " + httpget.getRequestLine());
      CloseableHttpResponse httpResponse = httpclient.execute(httpget);
      System.out.println(httpResponse.getEntity().getContent().toString());
      HttpEntity entity = httpResponse.getEntity();
      String result = EntityUtils.toString(entity, "utf-8");
      System.out.println(result);
      JSONObject jsonObject = JSONObject.parseObject(result);
      if (StringUtils.equals(jsonObject.getString("status"), "1")) {
        JSONArray jsonArray = jsonObject.getJSONArray("geocodes");
        if (jsonArray.size() == 0) {
          return;
        }
        String location = jsonArray.getJSONObject(0).getString("location");
        String[] locations = location.split(",");
        if (locations.length != 2) {
          return;
        }
        System.out.println(locations[0] + ":" + locations[1]);
      } else {
        System.out.println(jsonObject.getString("info"));
      }
      EntityUtils.consume(entity);
      System.out.println("----------------------------------------");
      System.out.println("Request finished");
    }
  }

  public static CloseableHttpClient getInstance(int timeout, int retry) {
    RequestConfig config =
        RequestConfig.custom()
            // 设置连接超时时间，单位毫秒
            .setConnectTimeout(timeout * 1000)
            // 设置从connect Manager获取Connection 超时时间(从连接池中获取可用连接超时)，单位毫秒。
            .setConnectionRequestTimeout(timeout * 1000)
            // 请求获取数据的超时时间，单位毫秒。 如果访问一个接口，多少时间内无法返回数据，就直接放弃此次调用。
            .setSocketTimeout(timeout * 1000)
            .build();

    return HttpClients.custom()
        .setRetryHandler(retryHandler(retry))
        .setDefaultRequestConfig(config)
        .build();
  }

  private static HttpRequestRetryHandler retryHandler(int retry) {
    return (exception, executionCount, context) -> {
      System.out.println("try request: " + executionCount);

      if (executionCount >= retry) {
        return false;
      }
      if (exception instanceof UnknownHostException) {
        return false;
      }
      // 目标服务器不可达
      if (exception instanceof UnknownHostException) {
        return false;
      }
      // 连接被拒绝
      if (exception instanceof ConnectTimeoutException) {
        return false;
      }
      if (exception instanceof SSLException) {
        return false;
      }
      // 如果服务器丢掉了连接,重试
      if (exception instanceof NoHttpResponseException) {
        return true;
      }
      HttpClientContext clientContext = HttpClientContext.adapt(context);
      HttpRequest request = clientContext.getRequest();
      boolean idempotent = !(request instanceof HttpEntityEnclosingRequest);
      // 如果请求是幂等的，就再次尝试
      if (idempotent) {
        return true;
      }
      return false;
    };
  }
}
