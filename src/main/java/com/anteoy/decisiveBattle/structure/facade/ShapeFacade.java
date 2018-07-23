package com.anteoy.decisiveBattle.structure.facade;

/**
 * Created by zhoudazhuang on 17-12-13.
 */
public class ShapeFacade {
    public Circle circle = new Circle();
    public Rectangle rectangle = new Rectangle();

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }
}
