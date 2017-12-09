package com.anteoy.decisiveBattle.created.creator;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
//由普通方法修改为抽象方法，可仅实现需要的部分 而不是全实现为空
public  abstract class ColorDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
