package com.anteoy.jmtest;

import com.alibaba.fastjson.JSONObject;

/**
 * @auther zhoudazhuang
 * @date 18-7-24 10:52
 * @description
 */
public class Jbput {
  public static void main(String[] args) {
    // previous value, or null if none
    System.out.println(new JSONObject().put("cmd", "abc"));
    new JSONObject().put("cmd", "abc");
    // NullPointerException xx.toString() xx is null
    System.out.println(new JSONObject().put("cmd", "abc").toString());
  }
}
