package com.anteoy.coreJava.jmt.test;

import java.util.ArrayList;
import java.util.List;

/** Created by zhoudazhuang on 18-7-12. */
public class ListAddAll {

  public static void main(String[] args) {
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();

    list1.add("aa");
    list1.add("bb");
    list1.add("cc");

    list2.add("ee");
    list2.add("ff");
    list2.add("gg");
    list2.add("gg");

    list1.addAll(list2);

    System.out.println(list1);
  }
}
