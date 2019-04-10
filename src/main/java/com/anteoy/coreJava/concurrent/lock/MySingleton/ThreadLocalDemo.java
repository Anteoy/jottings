package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by root on 17-3-19.
 */
public class ThreadLocalDemo extends Thread{
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();

    private  int num;

    ThreadLocalDemo(int num) {
            this.num = num;
    }

    static class MyRunnable implements Runnable {
        private int num;

        public MyRunnable(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            threadLocal.set(String.valueOf(num));
            System.out.println("threadLocalValue:" + threadLocal.get());
            System.out.println("ThreadCurrent: " + Thread.currentThread().getName());

        }
    }

    public void run() {
        threadLocal.set(String.valueOf(num));
        System.out.println("threadLocalValue:" + threadLocal.get());
        System.out.println("ThreadCurrent: " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
//        Thread thread1 = new Thread(new MyRunnable(1));
////        thread1.threadLocals
//        new Thread(new MyRunnable(1)).start();
//        new Thread(new MyRunnable(2)).start();
//        new Thread(new MyRunnable(3)).start();

        Thread thread1 = new ThreadLocalDemo(1);
//        thread1.threadLocals;
        thread1.start();
        Thread thread2 = new ThreadLocalDemo(2);
        thread2.start();
        Thread thread3 = new ThreadLocalDemo(3);
        thread3.start();
    }
}
