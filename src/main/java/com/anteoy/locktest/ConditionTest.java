package com.anteoy.locktest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by zhoudazhuang on 19-5-11.
 */
public class ConditionTest implements Runnable {
    ReentrantLock reenTRantLock ;
    Condition condition ;
    ConditionTest (ReentrantLock reenTRantLock ,Condition condition) {
        this.reenTRantLock = reenTRantLock;
        this.condition = condition;
    }



        @Override
        public void run() {
            reenTRantLock.lock();
            try {
                System.out.println("start await");
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                reenTRantLock.unlock();
            }
            System.out.println("await finished!!!");
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock reenTRantLock = new ReentrantLock();
        Condition condition = reenTRantLock.newCondition();
        Thread t1 = new Thread(new ConditionTest(reenTRantLock,condition));
        t1.start();
        Thread.sleep(2000); //如果不sleep 很可能先signal 而 死锁在t1上 会一直await
        System.out.println("main lock");
        reenTRantLock.lock();
        condition.signal();
        System.out.println("main signal");
        reenTRantLock.unlock();
        System.out.println("main unlock");
        t1.join(); //join以后会死锁了? 并不会
        System.out.println("ok");
    }
}
