package com.anteoy.jmtest.classload.clinit;

/**
 * Created by zhoudazhuang on 18-8-1.
 */
public class ClinitTest {
    static {
        //允许向前赋值 但不允许引用
        i = 0;
//        System.out.println(i);
    }
    static  int i = 1;

    static class Parent {
        public static int A = 1;
        // 类加载的初始化阶段 父类的static 也就是父类的clinit先于子类执行 所以 B = 2
        static {
            A = 2;
        }
    }

    static class Sub extends Parent{
        public static int B = A;
    }

    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}
