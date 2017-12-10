package com.anteoy.decisiveBattle.created.prototype;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class TestMain {
    public static void main(String[] args) {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.initData();
        Shape shape = ShapeCache.getShape("1");
        System.out.println(shape.getId()+":");
        shape.draw();
    }
}
