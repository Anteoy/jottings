package com.anteoy.decisiveBattle.structure.proxy;

/**
 * Created by zhoudazhuang on 17-12-10.
 * 优化： 补充添加了LoadingFromDisk
 */
public class MainTest {
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("test_file_name");
        proxyImage.display();

    }
}
