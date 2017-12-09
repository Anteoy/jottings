package com.anteoy.decisiveBattle.created.singleton;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class Singleton {
    //饿汉
    private static Singleton singleton1 = new Singleton();


    private Singleton(){
    }

    public static Singleton getSingleton1(){
        return singleton1;
    }

    //懒汉 volatile 容易忽略
    private volatile static Singleton singleton2;

    public static Singleton getSingleton2(){
        if (singleton2 == null){
            synchronized(Singleton.class){
                if (singleton2 == null){
                    singleton2 = new Singleton();
                }
                return singleton2;
            }
        }
        return singleton2;
    }
}
