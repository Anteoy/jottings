package com.anteoy.coreJava.others;

/**
 * Created by zhoudazhuang
 * Date: 16-12-28
 * Time: 下午4:38
 * Description : Ia,Ib接口有同名变量a，b只有其中一个有
 */
public class OoTest implements Ia, Ib {

    public int c = 0;

    {
        String sex = "ada";
    }

    public void oo() {
        OoTest ooTest = new OoTest();
//        int a = this.a; //编译报错
        int a = Ia.a;//编译通过
        int c = this.b;//编译通过
    }
}
