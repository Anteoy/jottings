package com.anteoy.decisiveBattle.created.factories.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Shape getShape(int flag) {
        return null;
    }

    @Override
    public Color getColor(int flag) {
        switch (flag) {
            case 1:
                return new RedColor();
            case 2:
                return new WhiteColor();
            case 3:
                return new BlackColor();
        }
        return null;
    }
}
