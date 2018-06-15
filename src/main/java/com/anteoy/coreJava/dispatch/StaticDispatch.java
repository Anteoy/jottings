package com.anteoy.coreJava.dispatch;

/**
 * Created by zhoudazhuang on 18-6-15.
 */
public class StaticDispatch {
    static abstract class Human{
    }
    static class Man extends Human{
    }
    static class Woman extends Human{
    }
    public static void sayHello(Human guy){
        System.out.println("hello,guy!");
    }
    public static void sayHello(Man guy){
        System.out.println("hello,gentlemen!");
    }
    public static void sayHello(Woman guy){
        System.out.println("hello,lady!");
    }

    public static void main(String[] args) {
        Human man=new Man();
        Human woman=new Woman();
        sayHello(man);
        sayHello(woman);
    }
}
