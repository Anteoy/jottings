package com.anteoy.decisiveBattle.created.factories.simpleFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class TestMain {
    public static void main(String[] args) {
        Shape instance;
        instance = ShapeFactory.getShape(1);
        instance.draw();
        instance = ShapeFactory.getShape(2);
        instance.draw();
        instance = ShapeFactory.getShape(3);
        instance.draw();
    }
}
