package com.anteoy.decisiveBattle.created.prototype;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
