package com.anteoy.decisiveBattle.behavier.Observer;

import java.util.ArrayList;

/**
 * Created by zhoudazhuang on 17-12-11.
 * 观察者订阅的目标
 */
public class Subject {
    ArrayList<Observer> arrayList = new ArrayList<>();

    public int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void addObserver(Observer observer) {
        arrayList.add(observer);
    }

    public void notifyAllObserver() {
        arrayList.forEach(a -> {
            a.update();
        });
    }
}
