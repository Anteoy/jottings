package com.anteoy.coreJava.others.staticTest;

/**
 * Created by zhoudazhuang
 * Date: 17-1-3
 * Time: 上午11:30
 * Description :
 */
public class StaticAndNostatic {
    String name; // 声明变量name
    String sex; // 声明变量sex
    static int age;// 声明静态变量age

    // 构造方法，手动声明构造方法之后，不论声明的是有参还是无参的构造方法，系统都不会再自动生成无参的构造方法
    public StaticAndNostatic() {
        System.out.println("通过构造方法初始化name");
        name = "tom";
    }

    // 初始化块
    {
        System.out.println("通过初始化块初始化sex");
        sex = "男";
    }

    // 静态初始化块，只在类加载的时候初始化一次，且只能初始化静态成员变量，不能初始化普通变量
    static {
        System.out.println("通过静态初始化块初始化age");
        age = 20;
    }

    public void show() {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age);
    }

    public static void main(String[] args) {

        // 创建对象
        StaticAndNostatic hello = new StaticAndNostatic();
        // 调用对象的show方法
        hello.show();
        StaticAndNostatic hello1 = new StaticAndNostatic();
    }
}
