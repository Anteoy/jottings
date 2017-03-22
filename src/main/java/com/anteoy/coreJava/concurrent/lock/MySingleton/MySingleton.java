package com.anteoy.coreJava.concurrent.lock.MySingleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by root on 17-3-19.
 */
//public class MySingleton {
//
//    private static MySingleton instance = new MySingleton();
//
//    private MySingleton(){}
//
//    public static MySingleton getInstance() {
//        return instance;
//    }
//
//}
public class MySingleton implements Serializable {
////使用volatile关键字保其可见性
    private static MySingleton instance = null;

    private MySingleton(){}

    /*synchronized*/ public static MySingleton getInstance() throws InterruptedException {//2. 对该方法进行synchronized的锁同步
        //3. 从执行结果上来看，问te题已经解决了，但是这种实现方式的运行效率会很低。同步方法效率低， 上下放都可以解决
        //3. 这里的实现能够保证多线程并发下的线程安全性，但是这样的实现将全部的代码都被锁上了，同样的效率很低下。
//        synchronized (MySingleton.class) {
            if(instance == null){//懒汉式
                //1. 创建实例之前可能会有一些准备性的耗时工作 测试并发安全性 不加这个是测试不出来的
                //4. 针对某些重要的代码进行单独的同步，而不是全部进行同步，可以极大的提高执行效率，
                synchronized(MySingleton.class){
                    Thread.sleep(300);
//                    synchronized(MySingleton.class){
                        if(instance == null){
                            instance = new MySingleton();
                        }
//                    }
                }
            }
            return instance;
//        }
    }

    //遇到序列化对象时，默认的方式运行得到的结果就是多例的
    //该方法在反序列化时会被调用，该方法不是接口定义的方法，有点儿约定俗成的感觉
    //保证序列化和翻序列化的对象的hashcode一致 保证单例
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用了readResolve方法！");
        return MySingleton.instance;
    }
}