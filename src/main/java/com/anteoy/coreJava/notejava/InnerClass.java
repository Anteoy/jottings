package com.anteoy.coreJava.notejava;

/**
 * Created by zhoudazhuang on 18-6-19.
 */
public class InnerClass {
    private int age = 12;
    public InnerClass(int age) {
        this.age = age;
        getInInstance().print();   //必须先创建成员内部类的对象，再进行访问!
    }

    private Inner getInInstance() {
        return new Inner();
    }
     class Inner {
         //必须内部类为static才可以
//        public static int b = 1;
        public void print() {
            System.out.println("内部类没同名，所以直接调用外部类成员变量：" + age);
        }
    }
}

class test1 {
    public static void main(String[] args) {
        InnerClass out = new InnerClass(10);
    }
}
