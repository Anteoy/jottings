package com.anteoy.decisiveBattle.structure.flyweight;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class Circle implements Shape {
    public String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("draw circle with color:" + color);
    }
}
