package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by root on 17-3-19.
 */
public enum EnumTest {
    Rong360(2), Shangshu(3), Test(4);

    public int value;

    private EnumTest(int value) {
        this.value = value;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(EnumTest.Rong360.toString());
        System.out.println(EnumTest.Rong360.value);
        System.out.println(EnumTest.Shangshu.value);
    }
}