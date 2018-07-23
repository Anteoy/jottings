package com.anteoy.designPatterns.strategy.impl;


import com.anteoy.designPatterns.strategy.FlyingStragety;

public class FlyWithRocket implements FlyingStragety {

    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }

}