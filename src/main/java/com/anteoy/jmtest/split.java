package com.anteoy.jmtest;

/**
 * @auther zhoudazhuang
 * @date 18-7-25 18:03
 * @description
 */
public class split {
  public static void main(String[] args) {
    String test = "172.20.16.19:9394:4";
    // not equal
//    String a[] = Strings.split(test, ":");
    String a[] = test.split(":");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
