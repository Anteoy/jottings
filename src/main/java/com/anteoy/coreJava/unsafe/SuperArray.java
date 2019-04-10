package com.anteoy.coreJava.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @auther zhoudazhuang
 * @date 19-3-22 17:11
 * @description
 */
public class SuperArray {

    public static void main(String[] arg) throws Exception{

        //通过反射实例化Unsafe
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        //只要内存够大，可以把这个调大，大于Integer.MAX_VALUE
        // 如果用加法 会变成负数 如Integer.MAX_VALUE+0x1 -2147483648
        long size = (long)(Integer.MAX_VALUE);
        size = size + 10;
        System.out.println(size);
        long addr = unsafe.allocateMemory(size);
        System.out.println("unsafe address :"+addr);

        for (int i = 0; i < size; i++) {
            unsafe.putByte(addr+i, (byte)6);
            if(unsafe.getByte(addr+i) !=6){
                System.out.println("failed at offset");
            }
        }
    }

}
