package com.anteoy.decisiveBattle.factoryMethod;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class CircleFactory implements Factory{
    @Override
    public Shape factoryMethod() {
        return new Circle();
    }
}
