package com.anteoy.decisiveBattle.structure.decorator;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public abstract class ShapeDecorator implements Shape {
    public Shape shape;

    ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public abstract void draw();

    //正确的做法不是在这里添加抽象方法 在main中调用 而应该在子类中 把setRedBorder方法 置入draw中，这样更加合理一些，在draw中添加颜色
    public abstract void setRedBorder();
}
