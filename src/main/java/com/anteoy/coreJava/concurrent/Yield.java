package com.anteoy.coreJava.concurrent;

/**
 * Created by root on 16-7-10.
 */
public class Yield extends Thread{
    public Yield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                System.out.println(this);
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        Yield yt1 = new Yield("00");
        Yield yt2 = new Yield("11");
        yt1.getName();
        yt1.start();
        yt2.start();
    }
}
