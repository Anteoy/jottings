package com.anteoy.decisiveBattle.behavier.Observer.jdkobserver;


/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class MainTest {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver();
        OctalObserver octalObserver = new OctalObserver();

        subject.addObserver(binaryObserver);
        subject.addObserver(octalObserver);

        //注意 使用jdk观察者模式 这里必须要调用setChanged方法 并且由于protected 必须要重写 否则notify无效
        subject.setChanged();
        subject.notifyObservers("custom args");
    }
}
