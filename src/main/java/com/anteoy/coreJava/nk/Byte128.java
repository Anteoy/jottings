package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-12-6.
 */
public class Byte128 {
    public static void main(String[] args) {
        short a = 128;
        byte b = (byte)a;
        System.out.println(b);
        //右移的规则只记住一点：符号位不变，左边补上符号位
        //右移不能单独除以2^n此方算,目前验证为如果能整除则正确
        System.out.println(-1>>2);
        System.out.println("==");
        System.out.println(-2>>2);
        System.out.println(-3>>2);
        System.out.println(-4>>2);
        System.out.println(-5>>2);
        System.out.println("===12===");
        System.out.println(-12>>2);
        System.out.println("===24===");
        System.out.println(-24>>2);
        //右移也会取模
        System.out.println(-5>>1);
        System.out.println("===33===");
        System.out.println(-5>>33);
        System.out.println("===34===");
        System.out.println(-5>>34);
        System.out.println(-5>>2);
        //在数字没有溢出的前提下，对于正数和负数，左移一位都相当于乘以2的1次方，左移n位就相当于乘以2的n次方
        //ok 90%32=2...26
        System.out.println(-1<<90);
        System.out.println(-1<<26);
        System.out.println(-1<<100);
        //如果移动的位数超过了该类型的最大位数，那么编译器会对移动的位数取模。如对int型移动33位，实际上只移动了332=1位。
        System.out.println(1<<33);
        //无符号位移 不考虑符号 高位全部补0 有符号是移动一位则负数补1 整数补0 如果位数溢出则取模
        System.out.println(3>>>2);
    }
}
