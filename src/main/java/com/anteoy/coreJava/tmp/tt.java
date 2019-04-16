package com.anteoy.coreJava.tmp;

import java.io.IOException;

/**
 * @auther zhoudazhuang
 * @date 19-4-16 10:19
 * @description 返回值必须是A或者其子类 抛出的异常类型同理 访问权限必须比protected大 不能把访问权限缩小了
 */
class A{
    protected A overwrite() throws Exception{
    System.out.println("A");
        return null;
    }
}

class B extends A {
    // 不能比protected的访问权限还小 比如default或者private
    public C overwrite() throws IOException{
    System.out.printf("B");
        return null;
    }
}

class C extends B {

}


public class tt {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        C c = new C();
        B b = new B();
        A a = new A();

        B bc = new C();
        A ac = new C();

        System.out.println(c instanceof C);
        System.out.println(c instanceof B);
        System.out.println(c instanceof A);

        System.out.println();

        System.out.println(c.getClass().isInstance(c));
        System.out.println(c.getClass().isInstance(b));
        System.out.println(c.getClass().isInstance(a));

        System.out.println();

        // 注意这种情况也是true
        System.out.println(c.getClass().isInstance(bc)); //true
        System.out.println(c.getClass().isInstance(ac)); //true

        System.out.println();

        System.out.println(A.class.isInstance(a));
        System.out.println(A.class.isInstance(b));
        System.out.println(A.class.isInstance(c));
        System.out.println(A.class.isInstance(ac));
        System.out.println(A.class.isInstance(bc));

        System.out.println();

        System.out.println(B.class.isInstance(a));
        System.out.println(B.class.isInstance(b));
        System.out.println(B.class.isInstance(c));
        System.out.println(B.class.isInstance(ac));
        System.out.println(B.class.isInstance(bc));


    }

}
