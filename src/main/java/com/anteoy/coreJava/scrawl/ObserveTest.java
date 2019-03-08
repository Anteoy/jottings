package com.anteoy.coreJava.scrawl;

import java.util.Observable;
import java.util.Observer;


/**
 * @auther zhoudazhuang
 * @date 19-3-6 10:15
 * @description
 * eg : java.util.EventListener
 */
public class ObserveTest implements Observer {
    @Override
    public void update(Observable o, Object arg) {
    System.out.println(o);
    System.out.println(arg);
    }
}

class Subject extends Observable{
    int a = 0;
    void set(int a){
        this.a = a;
    }
  public static void main(String[] args) {
      Subject subject = new Subject();
      subject.addObserver(new ObserveTest());
      subject.addObserver(new ObserveTest());
      subject.set(3);
      subject.setChanged();
      subject.notifyObservers(3);
  }
}