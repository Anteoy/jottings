package com.anteoy.designPatterns.strategy;


import com.anteoy.designPatterns.strategy.impl.FlyNoWay;

public class BigYellow extends Duck {

	public BigYellow() {
		super();
		super.setFlyingStragety(new FlyNoWay());
	}

	@Override
	public void display() {
		System.out.println("我身体很大，全身黄黄");
	}

}
