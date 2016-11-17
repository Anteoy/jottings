package com.anteoy.sample;

/**
 * Created by zhoudazhuang
 * Date: 16-11-17
 * Time: 下午6:19
 * Description :获得了三个Connection连接，但是只调用了一次枚举的构造方法,从而通过枚举实现了单例的设计
 *枚举单例是线程安全的
 *由于枚举实例的创建默认就是线程安全的，你不需要担心双检锁问题。
 * static{
 SPRING = new T("SPRING", 0);
 SUMMER = new T("SUMMER", 1);
 AUTUMN = new T("AUTUMN", 2);
 WINTER = new T("WINTER", 3);
 ENUM$VALUES = (new T[] {
 SPRING, SUMMER, AUTUMN, WINTER
 });
 }
 因为static类型的属性会在类被加载之后被初始化，我们在深度分析Java的ClassLoader机制（源码级别）和Java类的加载、链接和初始化两个文章中分别介绍过，当一个Java类第一次被真正使用到的时候静态资源被初始化、Java类的加载和初始化过程都是线程安全的。所以，创建一个enum类型是线程安全的。
 */
public class MyDataBaseSourceTest {
    public static void main(String[] args) {
        MyDataBaseSource.DATASOURCE.getConnection() ;
        MyDataBaseSource.DATASOURCE.getConnection() ;
        MyDataBaseSource.DATASOURCE.getConnection() ;
    }
}
