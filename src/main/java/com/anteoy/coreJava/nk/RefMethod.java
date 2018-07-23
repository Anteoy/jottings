package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-11-22.
 */
public class RefMethod {
    public static void main(String[] args) {
        Integer a = new Integer(1);
        Integer b = a;
        doSomeThing(b);
        System.out.println(a.intValue());
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }

    public static void doSomeThing(Integer integer) {
//        integer = new Integer(2);
//        integer = 2;
        integer = Integer.valueOf(2);
    }
}
