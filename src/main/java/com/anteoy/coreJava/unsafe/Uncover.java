package com.anteoy.coreJava.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @auther zhoudazhuang
 * @date 19-3-22 12:51
 * @description
 */
public class Uncover {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Field f = null;
        f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        System.out.println(unsafe);
        test2(unsafe);


    }

    static void test1(Unsafe unsafe) throws IllegalAccessException, InstantiationException {
        A o1 = new A(); // constructor
        System.out.println(o1.a()); // prints 1

        A o2 = A.class.newInstance(); // reflection
        System.out.println(o2.a()); // prints 1

        // 不会赋值 不会初始化不会构造函数
        A o3 = (A) unsafe.allocateInstance(A.class); // unsafe
        System.out.println(o3.a());// prints 0
    }

    static void test2(Unsafe unsafe) throws NoSuchFieldException {
        Guard guard = new Guard();
        guard.giveAccess();   // false, no access

        // bypass
        Field f = guard.getClass().getDeclaredField("ACCESS_ALLOWED");
        //过内存偏移地址修改变量值
        unsafe.putInt(guard, unsafe.objectFieldOffset(f), 42); // memory corruption
        guard.giveAccess(); // true, access granted
    }
}

class A {
    private long a = 10; // not initialized value

    public A() {
    System.out.println("init");
        this.a = 1; // initialization
    }

    public long a() { return this.a; }
}


class Guard {
    private int ACCESS_ALLOWED = 1;

    public boolean giveAccess() {
    System.out.println(42 == ACCESS_ALLOWED);
        return 42 == ACCESS_ALLOWED;
    }
}
