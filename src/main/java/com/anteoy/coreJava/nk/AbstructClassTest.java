package com.anteoy.coreJava.nk;

/**
 * Created by zhoudazhuang on 17-11-22.
 */
public class AbstructClassTest {
    //有构造函数也不能直接实例化
//    AbstructClass abstructClass = new AbstructClass() {
//        @Override
//        void a() {
//
//        }
//    };
    public static void Test(){
        System.out.println("a");
    }

    public static void main(String[] args) {
        AbstructClassTest abstructClass = null;
        abstructClass.Test();
    }
}
