package com.anteoy.decisiveBattle.behavier.Observer.jdkobserver;


import java.util.Observable;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class OctalObserver extends Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("OctalObserver update"+ arg);
    }
}
