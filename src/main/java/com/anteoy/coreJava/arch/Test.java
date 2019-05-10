package com.anteoy.coreJava.arch;

/**
 * @auther zhoudazhuang
 * @date 19-5-6 11:54
 * @description
 */
public class Test {

  public static void main(String[] args) {
      String[] a = new String[3];
      System.out.println(a[0]);
      change(a);
    System.out.println(a[0]);
  }

    public static void change(String[] a){
        a[0] = "test";
    }
}
