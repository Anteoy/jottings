package com.anteoy.decisiveBattle.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class TestMain {
    public static void main(String[] args) {
        Shape instance;
        Color instance1;
        AbstractFactory factory;
        factory = GetFactory.getFactory(1);
        instance = factory.getShape(2);
        instance.draw();
        factory = GetFactory.getFactory(2);
        instance1 = factory.getColor(1);
        instance1.fill();
    }
}
