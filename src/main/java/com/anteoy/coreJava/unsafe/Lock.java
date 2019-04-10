package com.anteoy.coreJava.unsafe;

/**
 * @auther zhoudazhuang
 * @date 19-3-22 17:24
 * @description
 */
import java.util.concurrent.locks.LockSupport;

public class Lock {

    public static void main(String[] args) throws InterruptedException {

        ThreadPark threadPark = new ThreadPark();
        threadPark.start();
        ThreadUnPark threadUnPark = new ThreadUnPark(threadPark);
        threadUnPark.start();
        //等待threadUnPark执行成功
        threadUnPark.join();
        System.out.println("运行成功....");
    }


    static  class ThreadPark extends Thread{

        public void run(){
            System.out.println(Thread.currentThread() +"我将被阻塞在这了60s....");
            //阻塞60s，单位纳秒  1s = 1000000000
            LockSupport.parkNanos(1000000000l*60);

            System.out.println(Thread.currentThread() +"我被恢复正常了....");
        }
    }

    static  class ThreadUnPark extends Thread{

        public Thread thread = null;

        public ThreadUnPark(Thread thread){
            this.thread = thread;
        }
        public void run(){

            System.out.println("提前恢复阻塞线程ThreadPark");
            //恢复阻塞线程
            LockSupport.unpark(thread);

        }
    }
}
