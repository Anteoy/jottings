package com.anteoy.decisiveBattle.created.factories.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class ShapeFactory implements AbstractFactory{
    @Override
    public Shape getShape(int flag) {
        switch(flag){
            case 1:
                return new Circle();
            case 2:
                return new Rectangle();
            case 3:
                return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(int flag) {
        return null;
    }

}
