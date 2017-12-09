package com.anteoy.decisiveBattle.abstractFactory;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class GetFactory {
    public static AbstractFactory getFactory(int flag){
        if (flag == 1){
            return new ShapeFactory();
        }
        if(flag == 2 ){
            return new ColorFactory();
        }
        return null;
    }
}
