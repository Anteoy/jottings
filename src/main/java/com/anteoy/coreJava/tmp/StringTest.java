package com.anteoy.coreJava.tmp;

import java.io.UnsupportedEncodingException;

/**
 * @auther zhoudazhuang
 * @date 19-4-9 13:43
 * @description
 */
public class StringTest {
  public static void main(String[] args) throws UnsupportedEncodingException {
      char c1 = '我';
      Character c2 = 'w';
      String s1 = new String();
      System.out.println(s1);
      String s2 = "厉害";
      int[] i = new int[2];
      i[0] = '棒';
      i[1] = '啊';
      for (int i1: i){
        System.out.println("\\u"+Integer.toHexString(i1));
      }
      String us = new String(i,0,2);
      System.out.println(us);
      System.out.println("\\u"+Integer.toHexString(us.codePointAt(0)));
      byte[] ba = us.getBytes("UTF-8");
      System.out.println(ba.length);
      System.out.println(new String(ba,"UTF-32"));
      System.out.println(String.join("|","???","...","啥"));
      String hexStr = String.format("\\u%H",'棒');
      System.out.println(hexStr);
  }
}
