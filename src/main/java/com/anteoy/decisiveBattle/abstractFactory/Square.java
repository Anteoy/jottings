package com.anteoy.decisiveBattle.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square draw call...");
    }
}
