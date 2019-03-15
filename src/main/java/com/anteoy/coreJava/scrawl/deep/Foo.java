package com.anteoy.coreJava.scrawl.deep;

/**
 * @auther zhoudazhuang
 * @date 19-3-14 13:48
 * @description
 */
import sun.misc.Unsafe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Foo {
    private boolean flag = true;

    public boolean getFlag() {
        return this.flag;
    }

    public static void main(String[] args) throws InvocationTargetException,
            NoSuchMethodException,
            InstantiationException,
            IllegalAccessException,
            NoSuchFieldException {
        Foo foo = new Foo();
        Field field = foo.getClass().getDeclaredField("flag");
        Unsafe unsafe = foo.getUnsafeByConstructor();
        long addr = unsafe.objectFieldOffset(field);

        for (byte b = 0; b < 4; b++) {
            System.out.println("Unsafe.putByte: " + b);
            unsafe.putByte(foo, addr, b);

            System.out.println("Unsafe.getByte: " + unsafe.getByte(foo, addr)); // 总是会打印出put的值
            System.out.println("Unsafe.getBoolean: " + unsafe.getBoolean(foo, addr)); // 打印出的值，像是ifeq, flag != 0即true

            System.out.println("foo.flag: " + foo.flag);  // 像是ifeq, flag != 0即true
            System.out.println("foo.getFlag: " + foo.getFlag()); // 像是 ((flag) & 1)

            // 此处是内联了？
            if (foo.flag) {
                System.out.println("Hello, Java!" + " foo.flag");
            }

            // 此处是内联了？
            if (true == foo.flag) {
                System.out.println("Hello, JVM!" + " foo.flag");
            }

            if (foo.getFlag()) {
                System.out.println("Hello, Java!" + " getFlag");
            }

            if (true == foo.getFlag()) {
                System.out.println("Hello, JVM!" + " getFlag");
            }

            System.out.println("-----------------------------------------------------------");
        }
    }

    private static Unsafe getUnsafeByConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Unsafe> unsafeConstructor = Unsafe.class.getDeclaredConstructor();
        unsafeConstructor.setAccessible(true);
        Unsafe unsafe = unsafeConstructor.newInstance();

        return unsafe;
    }

    private static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
        Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
        theUnsafe.setAccessible(true);
        Unsafe unsafe = (Unsafe) theUnsafe.get(null);
        return unsafe;
    }
}

/*
unsafe.putByte(foo, addr, (byte)2); // 设置为: 2
System.out.println(unsafe.getByte(foo, addr)); // 打印getByte: 2
System.out.println(unsafe.getBoolean(foo, addr)); // 打印getBoolean: true
unsafe.putByte(foo, addr, (byte)1); // 设置为: 1
System.out.println(unsafe.getByte(foo, addr)); // 打印getByte: 1
System.out.println(unsafe.getBoolean(foo, addr)); // 打印getBoolean: true
------------------------------------------------------------------------------------
疑问：
if(foo.flag)判断，使用getfield	Field flag:"Z"，执行逻辑等于：0 ！= flag
if(foo.getFlag())判断，使用invokevirtual	Method getFlag:"()Z"，执行逻辑等于： 0 != （(flag) & 1）
求大神帮忙解答
*/
