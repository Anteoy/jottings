package com.anteoy.coreJava.scrawl.faq;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 19-3-13 11:18
 * @description java -Xms2m -Xmx3m -XX:+PrintGCDetails -cp . com.anteoy.coreJava.scrawl.faq.Oom
 */
public class Oom {
  static void StrongReference1() throws InterruptedException {
    List<SoftReference<byte[]>> list = new ArrayList<>();
    Test test = null;
//    byte[] bytes = null;
    Thread.sleep(30000);
    for (int i = 0; i < 10; i++) {
//      test = new Test();
      byte[] bytes = new byte[1024*1024];
      System.out.println("sleep 第: " + i + "次");
//      Thread.sleep(10000);
      SoftReference<byte[]> sr = new SoftReference<byte[]>(bytes);
      list.add(sr);
    }
    for (int i = 0; i < 10; i++) {
      byte[] obj = list.get(i).get();
      System.out.println(obj);
    }
    System.out.println("ok.....");
    System.gc();
    Thread.sleep(30000*2);
    for (int i = 0; i < 10; i++) {
      byte[] obj = list.get(i).get();
      System.out.println(obj);
    }
  }

  static void StrongReference2() throws InterruptedException {
    List<SoftReference<byte[]>> list = new ArrayList<>();
    Thread.sleep(30000);
    for (int i = 0; i < 10; i++) {
      Test test = new Test();
      System.out.println("sleep 第: " + i + "次");
      Thread.sleep(10000);
      SoftReference<byte[]> sr = new SoftReference<byte[]>(test.data);
      list.add(sr);
    }
    for (int i = 0; i < 10; i++) {
      byte[] obj = list.get(i).get();
      System.out.println(obj);
    }
    System.out.println("ok.....");
    Thread.sleep(30000);
  }

  static class Test {
    byte[] data = new byte[1024 * 1024];
  }

  public static void main(String[] args) throws InterruptedException {
    StrongReference1();
  }

}
