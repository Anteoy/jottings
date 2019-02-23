package com.anteoy.scrawl;

/**
 * Created by zhoudazhuang on 19-2-17.
 */
public abstract class AbstractClass {
    protected abstract void f();
    AbstractClass(){}

    public static void main(String[] args) {
//        AbstractClass  obj = new AbstractClass(); error
//        AbstractClass  obj = new Sub();
//        obj.f();

        int i = 1;
        System.out.println(i+++i++);
        System.out.println(i);
        System.out.println(i+++i++);
        System.out.println(i);
    }
}

//class Sub extends AbstractClass{
//
//    @Override
//    public void f() {
//        System.out.println("1111");
//    }
//}