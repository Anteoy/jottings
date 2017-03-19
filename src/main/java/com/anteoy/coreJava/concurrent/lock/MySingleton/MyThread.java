package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by root on 17-3-19.
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        try {
//            System.out.println(MySingleton.getInstance().hashCode());//普通实现
            System.out.println(ClassFactory.getInstance().hashCode());//枚举实现
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        MyThread[] mts = new MyThread[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new MyThread();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }
}
