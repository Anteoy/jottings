package com.anteoy.coreJava.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by zhoudazhuang on 17-3-15.
 * Description:java.util.concurrent.Executors类的API，这个类提供大量创建连接池的静态方法，是必须掌握的。
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        // 创建一个可重用固定线程数的线程池
        //interface ExecutorService extends Executor 多态 面向接口编程 ExecutorService 接受各种线程池
//        ExecutorService pool = Executors.newFixedThreadPool(5);//fix 固定
//        ExecutorService pool = Executors.newFixedThreadPool(2);//fix 固定
        //单任务线程池，newSingleThreadExecutor：
//        ExecutorService pool = Executors.newSingleThreadExecutor();
        //可变尺寸的线程池，newCachedThreadPool
        //可根据需要创建新线程的线程池，但是在以前构造的线程可用时将重用它们。
        ExecutorService pool = Executors.newCachedThreadPool();
        // 创建线程
        Executors executors = null;
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        // 将线程放入池中进行执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(t5);
        // 关闭线程池
        pool.shutdown();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "正在执行。。。");
    }
}
