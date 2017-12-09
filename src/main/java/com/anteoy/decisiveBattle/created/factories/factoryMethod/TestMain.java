package com.anteoy.decisiveBattle.created.factories.factoryMethod;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class TestMain {
    public static void main(String[] args) {
        Shape instance;
        Factory factory;
        factory = new CircleFactory();
        instance = factory.factoryMethod();
        instance.draw();
        factory = new SquareFactory();
        instance = factory.factoryMethod();
        instance.draw();
        factory = new RectangleFactory();
        instance = factory.factoryMethod();
        instance.draw();

    }
}
