package com.anteoy.locktest;

/**
 * Created by zhoudazhuang on 19-5-11.
 */
public class TestLock {

    public static void main(String[] args) throws InterruptedException {
        new TestLock().print();
    }

    Lock1 lock = new Lock1();
    public void print() throws InterruptedException {
        System.out.println("开始上锁");
        lock.lock();
        doAdd();
        lock.unlock();
    }
    public void doAdd() throws InterruptedException {
        lock.lock();
        //do something
        System.out.println("可重入锁...");
        lock.unlock();
    }


    class Lock{
        private boolean isLocked = false;
        public synchronized void lock() throws InterruptedException{
            while(isLocked){
                wait();
            }
            isLocked = true;
        }
        public synchronized void unlock(){
            isLocked = false;
            notify();
        }
    }


    public class Lock1{
        boolean isLocked = false;
        Thread  lockedBy = null;
        int lockedCount = 0;
        public synchronized void lock()
                throws InterruptedException{
            Thread thread = Thread.currentThread();
            while(isLocked && lockedBy != thread){
                wait();
            }
            isLocked = true;
            lockedCount++;
            lockedBy = thread;
        }
        public synchronized void unlock(){
            if(Thread.currentThread() == this.lockedBy){
                lockedCount--;
                if(lockedCount == 0){
                    isLocked = false;
                    notify();
                }
            }
        }
    }

}
