package com.anteoy.decisiveBattle.structure.flyweight;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class MainTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.getCircle("red");
        shapeFactory.getCircle("red");
    }
}
