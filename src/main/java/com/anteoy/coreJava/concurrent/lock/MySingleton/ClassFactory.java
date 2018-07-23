package com.anteoy.coreJava.concurrent.lock.MySingleton;

/**
 * Created by root on 17-3-19.
 * 使用enum枚举实现单例模式
 */
public class ClassFactory {

    private enum MyEnumSingleton {
        singletonFactory;

        private MySingleton2 instance;

        private MyEnumSingleton() {//枚举类的构造方法在类加载是被实例化
            instance = new MySingleton2();
        }

        public MySingleton2 getInstance() {
            return instance;
        }
    }

    public static MySingleton2 getInstance() {
        return MyEnumSingleton.singletonFactory.getInstance();
    }
}

class MySingleton2 {//需要获实现单例的类，比如数据库连接Connection

    public MySingleton2() {
    }
}
