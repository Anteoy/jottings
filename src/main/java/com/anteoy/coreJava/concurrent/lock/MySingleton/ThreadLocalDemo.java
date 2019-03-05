package com.anteoy.coreJava.concurrent.lock.MySingleton;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by root on 17-3-19.
 */
public class ThreadLocalDemo {
    private ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    HashMap  hashMap = new HashMap();
    Hashtable hashtableh = new Hashtable();
    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

    class MyRunnable implements Runnable {
        private int num;

        public MyRunnable(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            hashMap.put("1",2);
            String test = "";
            hashMap.get("1");
            threadLocal.set(String.valueOf(num));
            System.out.println("threadLocalValue:"+ Thread.currentThread().getName() + "=>" + threadLocal.get());
        }
    }

    public static void main(String[] args) {
        new Thread(new ThreadLocalDemo().new MyRunnable(1)).start();
        new Thread(new ThreadLocalDemo().new MyRunnable(2)).start();
        new Thread(new ThreadLocalDemo().new MyRunnable(3)).start();
    }
}
