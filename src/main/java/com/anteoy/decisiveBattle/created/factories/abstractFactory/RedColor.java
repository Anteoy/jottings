package com.anteoy.decisiveBattle.created.factories.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class RedColor implements Color{
    @Override
    public void fill() {
        System.out.println("fill red color");
    }
}
