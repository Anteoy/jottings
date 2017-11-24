package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-11-24.
 */
public class StaticCall {
    public static void a(){
        b();
    }

    public static void b(){
        System.out.println("bb");
    }

    public static void main(String[] args) {
        a();
    }
}
