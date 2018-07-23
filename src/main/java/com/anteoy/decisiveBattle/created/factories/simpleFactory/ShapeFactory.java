package com.anteoy.decisiveBattle.created.factories.simpleFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class ShapeFactory {
    public static Shape getShape(int flag) {
        switch (flag) {
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            case 3:
                return new Square();
        }
        return null;
    }
}
