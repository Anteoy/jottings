package com.anteoy.decisiveBattle.structure.decorator;

/**
 * Created by zhoudazhuang on 17-12-11.
 */
public class TestMain {
    public static void main(String[] args) {
        ShapeDecorator  shapeDecorator = new RedShapDecorator(new Circle());
        shapeDecorator.draw();
        shapeDecorator.setRedBorder();
        ShapeDecorator  shapeDecorator1 = new RedShapDecorator(new Rectangle());
        shapeDecorator1.draw();
        //正确的做法不是在这里添加抽象方法 在main中调用 而应该在子类中 把setRedBorder方法 置入draw中，这样更加合理一些，在draw中添加颜色
        shapeDecorator1.setRedBorder();
    }
}
