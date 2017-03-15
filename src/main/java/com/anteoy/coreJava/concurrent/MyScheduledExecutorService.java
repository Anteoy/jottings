package com.anteoy.coreJava.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhoudazhuang on 17-3-15.
 * Description:安排延迟的线程池
 */
public class MyScheduledExecutorService {
    public static void main(String[] args) {
        // 创建一个线程池，它可安排在给定延迟后运行命令或者定期地执行。
        //corePoolSize - 池中所保存的线程数，即使线程是空闲的也包括在内。
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        // 创建实现了Runnable接口对象，Thread对象当然也实现了Runnable接口
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        // 将线程放入池中进行执行
        pool.execute(t1);
        // 使用延迟执行风格的方法
        pool.schedule(t2, 1000, TimeUnit.MILLISECONDS);
        pool.schedule(t3, 10, TimeUnit.MILLISECONDS);

        // 关闭线程池
        pool.shutdown();
    }
}

