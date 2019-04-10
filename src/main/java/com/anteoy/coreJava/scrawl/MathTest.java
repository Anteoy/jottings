package com.anteoy.coreJava.scrawl;

/**
 * @auther zhoudazhuang
 * @date 19-3-12 10:49
 * @description
 */
public class MathTest {
  public static void main(String[] args) {
      // * << |
      System.out.println(1<<1*1|7);
      System.out.println((1<<1*1)|7);
      System.out.println((1<<(1*1))|7);
      System.out.println(1<<1*(1|7));
      System.out.println(1|7);
      System.out.println(1<<1*7);
      System.out.println(1<<(1*7));

      System.out.println((1<<1)*(1|7));
  }
}
