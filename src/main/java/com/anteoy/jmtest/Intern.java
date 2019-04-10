package com.anteoy.jmtest;

import java.util.Random;

/**
 * Created by zhoudazhuang on 18-7-28.
 */
public class Intern {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = "aaa";
        System.out.println(s1 == s2);    // false

        s1 = new String("bbb").intern();
        s2 = "bbb";
        System.out.println(s1 == s2);    // true


        Integer[] DB_DATA = new Integer[1000000];
        Random random = new Random(1000000);
        for (int i = 0; i < DB_DATA.length; i++) {
            DB_DATA[i] = random.nextInt();
        }
        String[] arr = new String[DB_DATA.length];
        long t = System.currentTimeMillis();
        for (int i = 0; i < DB_DATA.length; i++) {
            arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length]));                // --- 每次都要new一个对象
//             arr[i] = new String(String.valueOf(DB_DATA[i % DB_DATA.length])).intern();    // --- 其实虽然这么多字符串，但是类型最多为10个，大部分重复的字符串,大大减少内存 目前测试更加消耗时间 慢很多
        }
        System.out.println((System.currentTimeMillis() - t) + "ms");
//        System.gc();
        a();
    }


    public static void a() {
        System.out.println("===============");
        String s1 = "HelloWorld";
        String s2 = new String("HelloWorld");
        String s3 = "Hello";
        String s4 = "World";
        String s5 = "Hello" + "World";
        String s6 = s3 + s4;

        System.out.println(s1 == s2); //false
        System.out.println(s1 == s5); //true
        System.out.println(s1 == s6); //false
        System.out.println(s1 == s6.intern()); //true
        System.out.println(s2 == s2.intern()); //false

    }
}
