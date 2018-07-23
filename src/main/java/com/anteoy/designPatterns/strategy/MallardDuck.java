package com.anteoy.designPatterns.strategy;


import com.anteoy.designPatterns.strategy.impl.FlyWithWin;

public class MallardDuck extends Duck {


    public MallardDuck() {
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }

}
