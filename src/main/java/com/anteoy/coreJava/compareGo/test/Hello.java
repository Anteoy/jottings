package com.anteoy.coreJava.compareGo.test;

/**
 * Created by zhoudazhuang on 17-3-24.
 * Description: 可以打开.class文件看指定的包名
 * 特别注意这个时候不能用package指定包名 不然java Hello(这个字节码的时候，会报错找不到这个包，也不能用main，直接不写就行了，但是在ide里面是需要指定的)
 * 报错示例：Exception in thread "main" java.lang.NoClassDefFoundError: Hello (wrong name: main/Hello)
 * 1. javac Hello.java 当前目录生成Hello.class
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("日本人");
    }
}
