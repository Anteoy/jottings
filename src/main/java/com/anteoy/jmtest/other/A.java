package com.anteoy.jmtest.other;

public abstract class A implements I {

    @Override
    public void funA(String a) {
        System.out.println(getClass() + " string call :" + a);
    }

    public void funA(int a) {
        System.out.println(getClass() + " int call :" + a);
    }
}
