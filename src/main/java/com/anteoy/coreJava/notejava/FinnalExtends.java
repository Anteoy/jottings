package com.anteoy.coreJava.notejava;

/**
 * Created by zhoudazhuang on 18-6-19.
 */
public class FinnalExtends {

    static int b = 1;
    public static final int a = 1;

    static class sub extends FinnalExtends {
        //final是不能重写的 但是是继承过来了的
//        public static final int a = 2;
        static int b = 2;
    }

    static abstract class test {
        //can not static
        public abstract void a();
    }

    public static void main(String[] args) {
        FinnalExtends finnalExtends = new sub();
        System.out.println(finnalExtends.a);

        sub sub = new sub();
        System.out.println(sub.a);
    }
}
