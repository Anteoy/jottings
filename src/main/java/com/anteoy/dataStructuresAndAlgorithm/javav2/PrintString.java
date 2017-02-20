package com.anteoy.dataStructuresAndAlgorithm.javav2;

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
        //递归临界条件
        if(n>=10){
            //前递归顺序执行
            printStrs(n/10);
        }
        //后递归执行（反前递归顺序）
        System.out.println(n%10);
    }

    private static void printByte(int n){
        //转为String
        String s = String.valueOf(n);
        byte[] bytes = s.getBytes();
        for (byte b: bytes) {
            System.out.println(String.valueOf(b));
        }
    }
    //add private只能在类内部使用（如new 其他都不行）
    private static void printString(int n){
        //转为String
        String s = String.valueOf(n);
        //转为char[]
        char[] chars = new char[s.length()];
        s.getChars(0,s.length(),chars,0);
        //for each输出
        for (char b: chars) {
            System.out.println(String.valueOf(b));
        }
    }
}
