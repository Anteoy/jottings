package com.anteoy.jmtest.classload;

/**
 * Created by zhoudazhuang on 18-7-31.
 * 常量在编译阶段会存入调用类的常量池中，本质上没有直接引用到定义常量的类 因此不会触发定义常量类的初始化
 */
public class ConstClass {

    // 初始化才会执行static块
    static {
        System.out.println("const class init!");
    }

    public static final String HE = "ri ben ren";
}
