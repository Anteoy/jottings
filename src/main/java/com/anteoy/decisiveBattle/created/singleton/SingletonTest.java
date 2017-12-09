package com.anteoy.decisiveBattle.created.singleton;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton1();
        System.out.println(singleton1.toString());
        Singleton singleton2 = Singleton.getSingleton2();
        System.out.println(singleton2.toString());

    }
}
