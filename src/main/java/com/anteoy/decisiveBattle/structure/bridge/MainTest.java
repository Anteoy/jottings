package com.anteoy.decisiveBattle.structure.bridge;

/**
 * Created by zhoudazhuang on 17-12-10.
 * 补充：可以用构造函数和设计参数传递参数代替赋值进行优化
 */
public class MainTest {
    public static void main(String[] args) {
        Shape shape = new Circle();
        DrawAPI drawAPI2 = new BlueCircle();
        shape.drawApi = drawAPI2;
        shape.draw();
    }
}
