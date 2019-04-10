package com.anteoy.coreJava.concurrent.lock.MySingleton.p2;

import com.anteoy.coreJava.concurrent.lock.MySingleton.p1.ClassA;

/**
 * Created by zhoudazhuang on 19-2-27.
 */
public class ClassB extends ClassA{
    int b = this.a;
    public  void main(String[] args) {
        ClassA classA = new ClassA();
        int b1 = a;
        int b2 = super.a;
//        new ClassA().a; error
    }
}

class D {
    public static void main(String[] args) {
        int b = new ClassB().b;
//        int c = new ClassB().a; error
    }
}