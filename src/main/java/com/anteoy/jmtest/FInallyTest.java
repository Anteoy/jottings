package com.anteoy.jmtest;

/**
 * @auther zhoudazhuang
 * @date 18-8-7 09:48
 * @description
 */
public class FInallyTest {
  public static void main(String[] args) throws Throwable {
    try {
        throw new Exception("");
    }catch(Exception e) {
        e.printStackTrace();
        throw e.getCause();
    }finally{
      System.out.println(1111);
    }
  }
}
