package com.anteoy.coreJava.concurrent.lock;

/**
 * Created by root on 17-3-19.
 */
public class GetToken {
    static int i = 1;

    public static void get() {
        synchronized (GetToken.class) {
            for (int j = 1; j < 5; j++) {
                System.out.println(Thread.currentThread().getName() + " :" + ++i);
//                try {
//                    Thread.sleep(1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }

    public static void main(String[] args) {
        GetToken getToken = new GetToken();

        for (int i = 0; i < 50; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    GetToken.get();
                }
            }, String.valueOf(i)).start();
        }
    }
}
