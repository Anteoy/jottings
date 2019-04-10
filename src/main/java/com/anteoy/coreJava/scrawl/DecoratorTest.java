package com.anteoy.coreJava.scrawl;

import java.io.*;

/**
 * @auther zhoudazhuang
 * @date 19-3-6 13:49
 * @description
 */
public class DecoratorTest {
    void test() throws IOException {

        while(true){
            //在达到buffer大小之前，只有遇到"/r"、"/n"、"/r/n"才会返回，否则一直阻塞。
            //用while处理完一行后继续阻塞
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(bufferedReader.readLine());
        }
        //InputStream OutputStream Reader Writer都是abstract class 抽象为流 而不是接口哦


    }

  public static void main(String[] args) throws IOException {
    new DecoratorTest().test();
  }
}
