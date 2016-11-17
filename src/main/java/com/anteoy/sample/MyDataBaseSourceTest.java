package com.anteoy.sample;

/**
 * Created by zhoudazhuang
 * Date: 16-11-17
 * Time: 下午6:19
 * Description :获得了三个Connection连接，但是只调用了一次枚举的构造方法,从而通过枚举实现了单例的设计
 *枚举单例是线程安全的
 *由于枚举实例的创建默认就是线程安全的，你不需要担心双检锁问题。
 */
public class MyDataBaseSourceTest {
    public static void main(String[] args) {
        MyDataBaseSource.DATASOURCE.getConnection() ;
        MyDataBaseSource.DATASOURCE.getConnection() ;
        MyDataBaseSource.DATASOURCE.getConnection() ;
    }
}
