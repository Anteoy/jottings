package com.anteoy.coreJava.niuk;

import java.util.HashMap;

/**
 * Created by root on 16-7-11.
 */
public class bb extends aa implements cc {

    static {
        System.out.println("静态代码快调用111");
    }

    public bb() {

        System.out.println("构造器调用2222");
    }

    int a;

    {
        a = 0;
        a();
        hh();
    }

    HashMap aa = new HashMap<String, String>() {
        {
            put("a", "b");
        }
    };

    /**
     * 方法的重写（override）两同两小一大原则：
     * 方法名相同，参数类型相同
     * 子类返回类型小于等于父类方法返回类型，
     * 子类抛出异常小于等于父类方法抛出异常，
     * 子类访问权限大于等于父类方法访问权限。
     *
     * @param a
     * @param b
     */
    public void a(int a, int b) {
        int c;
    }

    @Override
    public void a() {
        int b = a;
        int c = 0;//如果要使用，局部变量就需要初始化
        int d = c;
        hh();
    }

    public static void main(String[] args) {
        new bb() {
            @Override
            public void a() {
                System.out.println("a");
            }
            /*{
                a();
                hh();
            }*/
        };

        new HashMap<String, String>() {
            {
                put("a", "b");
            }
        };

    }
}
