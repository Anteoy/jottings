package com.anteoy.designPatterns.observePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象，它知道它的观察者，并提供注册（添加）和删除观察者的接口
 * @Author 周巖 on
 * @Date 2016/3/25.17:46
 */
public class WeatherSubject {
    //保存注册观察者对象
    private List<Observer> observers = new ArrayList<Observer>();

    //添加 把订阅天气的人添加到订阅列表中
    public void attach(Observer observer){
        observers.add(observer);
    }
    //删除 删除集合中指定的订阅天气的对象
    public void detach(Observer observer){
        observers.remove(observer);
    }
    /*
    通知所有注册的观察者对象 通知所有已经订阅了天气的人
     */
    protected void notifyObservers(){
        for(Observer observer: observers){
            observer.update(this);
        }
    }
}
