package com.anteoy.decisiveBattle.created.factories.factoryMethod;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class RectangleFactory implements Factory{
    @Override
    public Shape factoryMethod() {
        return new Rectangle();
    }
}
