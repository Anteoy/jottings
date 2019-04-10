package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by zhoudazhuang on 19-2-27.
 */
public class ThreadLocalTest {
    private static String strLabel;
    private static ThreadLocal<String> threadLabel = new ThreadLocal<>();

    public static void main(String... args) {
        strLabel = "main"; //如果不设置则默认为Null
//        threadLabel.set("main");

        Thread thread = new Thread() {

            @Override
            public void run() {
                super.run();
                strLabel = "child";
                threadLabel.set("child");
            }

        };

        thread.start();
        try {
            // 保证线程执行完毕
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("strLabel = " + strLabel);
        System.out.println("threadLabel = " + threadLabel.get());
    }
}
