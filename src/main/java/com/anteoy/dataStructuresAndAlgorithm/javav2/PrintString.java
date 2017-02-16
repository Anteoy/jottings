package com.anteoy.dataStructuresAndAlgorithm.javav2;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by zhoudazhuang on 17-2-16.
 * Description:
 */
public class PrintString {
    public static void main(String [] args)
    {
        printStrs(123456789);
        printByte(123456);
        printString(123456);
    }
    /**
     * 逐个字符打印所给整数
     * @param n 这里系统标准输出流每次都只打印一个字符
     */
    private static void printStrs(int n) {
        if(n>=10){
            printStrs(n/10);
        }
        System.out.println(n%10);
    }

    private static void printByte(int n){
        String s = String.valueOf(n);
        byte[] bytes = s.getBytes();
        for (byte b: bytes) {
            System.out.println(String.valueOf(b));
        }
    }

    private static void printString(int n){
        String s = String.valueOf(n);
        char[] chars = new char[s.length()];
        s.getChars(0,s.length(),chars,0);
        for (char b: chars) {
            System.out.println(String.valueOf(b));
        }
    }
}
