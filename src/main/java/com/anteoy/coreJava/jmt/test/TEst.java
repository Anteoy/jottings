package com.anteoy.coreJava.jmt.test;

import java.text.DecimalFormat;

/** Created by zhoudazhuang on 18-7-10. */
public class TEst {
  public static void main(String[] args) {
    DecimalFormat decimalFormat = new DecimalFormat("0.000");
    System.out.println(Float.parseFloat(decimalFormat.format((float) 1 / 3)));
    System.out.println(Math.round(((float) 1 / 9) * 1000 / 1000.0));
    System.out.println((float) ((1 - 0.333 * 3)));
  }
}
