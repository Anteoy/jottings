package com.anteoy.jmtest.jvminterpreter;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

public class MethodHandleTest {
    static class ClassA {
        public void println(String s){
            System.out.println(11111);
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Throwable {
        Object obj = System.currentTimeMillis() % 2 == 0 ? System.out: new ClassA();
        getPrintlnMH(obj).invokeExact("test");
    }

    private static MethodHandle getPrintlnMH(Object reveiver) throws Throwable {
        //MethodType 代表方法类型 就像可以传递方法作为参数一样 第一个参数是返回 hou mian zhege shi can shu
        MethodType mt = MethodType.methodType(void.class,String.class);
        return lookup().findVirtual(reveiver.getClass(),"println",mt).bindTo(reveiver);
    }
}
