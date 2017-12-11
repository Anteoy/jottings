package com.anteoy.decisiveBattle.behavier.Observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class Subject extends Observable{

    public void removeObserver(Observer observer) {
        super.deleteObserver(observer);
        System.out.println("成功告诉观察者我不需要被通知了");
    }

    //可以取消 synchronized 不过一般还是不会取消
    public synchronized void setChanged(){
        super.setChanged();
    }

}
