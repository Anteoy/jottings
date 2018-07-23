package com.anteoy.coreJava.concurrent.lock;

/**
 * Created by root on 17-3-19.
 * 无论是变量，方法，还是代码块，只要用static修饰，就是在类被加载时就已经"准备好了",也就是可以被使用(方法)或者已经被执行（静态变量，其他的是实例变量，代码快，优于构造气执行），都可以脱离对象而执行。反之，如果没有static，则必须要依赖于对象实例。
 */
public class StaticTest {

    public static int ooo = 345;

    public StaticTest() {
        System.out.println("构造器初始化");
    }

    static {
        System.out.println("static代码块初始化");
    }

    public static void oo() {
        System.out.println("静态方法");
    }

    public static void main(String[] args) {
        StaticTest staticTest = new StaticTest();
        StaticTest.oo();
        System.out.println(StaticTest.ooo);
    }
}
