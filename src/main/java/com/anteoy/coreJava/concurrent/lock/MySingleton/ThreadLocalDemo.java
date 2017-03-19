package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by root on 17-3-19.
 */
public class ThreadLocalDemo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    static class MyRunnable implements Runnable{
        private int num;
        public MyRunnable(int num){
            this.num = num;
        }
        @Override
        public void run() {
            threadLocal.set(String.valueOf(num));
            System.out.println("threadLocalValue:"+threadLocal.get());
        }
    }

    public static void main(String[] args){
        new Thread(new MyRunnable(1)).start();
        new Thread(new MyRunnable(2)).start();
        new Thread(new MyRunnable(3)).start();
    }
}
