package com.anteoy.coreJava.scrawl;

import java.util.List;

/**
 * @auther zhoudazhuang
 * @date 19-3-6 16:39
 * @description
 */
public class AdaptorTest {
    void test(){
        //返回的是一个arraylist
//       List<Integer> arrayList = java.util.Arrays.asList(new Integer[]{1,2,3});
        List<Integer> arrayList = java.util.Arrays.asList(1,2,3);
        for(int a: arrayList){
            System.out.println(a);
        }
    System.out.println("start test2");
        test2(1,2,3,4,5);
        test2(new Integer[]{11,22,33,44});
        test2();
    }

    <T> void test2(T... a){
        Integer b = 2;
        System.out.println(b.getClass());
        System.out.println(a);
        System.out.println(a.length);
        System.out.println(a.getClass());
        for(T t: a){
            System.out.println(t);
        }
    }


  public static void main(String[] args) {
    new AdaptorTest().test();
  }
}
