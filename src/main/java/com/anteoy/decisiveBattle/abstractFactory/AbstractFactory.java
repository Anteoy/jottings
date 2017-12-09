package com.anteoy.decisiveBattle.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public interface AbstractFactory {
    Shape getShape(int flag);
    Color getColor(int flag);
}
