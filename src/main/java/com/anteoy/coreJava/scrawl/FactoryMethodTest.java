package com.anteoy.coreJava.scrawl;

import java.util.Calendar;

/**
 * @auther zhoudazhuang
 * @date 19-3-6 16:24
 * @description
 */
public class FactoryMethodTest {
    void test(){
        Calendar calendar = java.util.Calendar.getInstance();
        System.out.println(calendar);
    }

  public static void main(String[] args) {
    new FactoryMethodTest().test();
  }
}
