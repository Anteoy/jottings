package com.anteoy.designPatterns.strategy.impl;


import com.anteoy.designPatterns.strategy.FlyingStragety;

public class FlyNoWay implements FlyingStragety {

    public void performFly() {
        System.out.println("我不会飞行！");
    }

}
