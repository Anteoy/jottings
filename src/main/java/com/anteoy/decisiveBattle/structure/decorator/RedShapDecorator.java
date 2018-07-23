package com.anteoy.decisiveBattle.structure.decorator;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class RedShapDecorator extends ShapeDecorator {
    public Shape shape;

    RedShapDecorator(Shape shape) {
        super(shape);
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

    //border 边缘 边境
    public void setRedBorder() {
        System.out.println("红色装饰器装饰了Shape");
    }
}
