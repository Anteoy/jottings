package com.anteoy.coreJava.scrawl.faq;


import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 19-3-13 11:18
 * @description  java -Xms2m -Xmx3m -XX:+PrintGCDetails -cp . com.anteoy.coreJava.scrawl.faq.Oom
 */
public class Oom {
    static void StrongReference1() throws InterruptedException {
        List<SoftReference<byte[]>> list = new ArrayList<>();
        byte[] buff = null;
        Thread.sleep(30000);
        for (int i = 0; i < 10; i++) {
            buff = new byte[1024*1024];
            SoftReference<byte[]> sr = new SoftReference<byte[]>(buff);
            list.add(sr);
        }
    for (int i = 0; i < 10; i++) {
        byte[] obj = list.get(i).get();
        System.out.println(obj);
    }
    }

    static void StrongReference2() throws InterruptedException {
        List<SoftReference<byte[]>> list = new ArrayList<>();
        Thread.sleep(30000);
        for (int i = 0; i < 10; i++) {
            byte[] buff = new byte[1024*1024];
            SoftReference<byte[]> sr = new SoftReference<byte[]>(buff);
            list.add(sr);
        }
        for (int i = 0; i < 10; i++) {
            byte[] obj = list.get(i).get();
            System.out.println(obj);
        }
    }

  public static void main(String[] args) throws InterruptedException {
    StrongReference2();
  }
}
