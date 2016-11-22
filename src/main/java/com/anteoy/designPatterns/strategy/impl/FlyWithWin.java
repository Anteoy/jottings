package com.anteoy.designPatterns.strategy.impl;


import com.anteoy.designPatterns.strategy.FlyingStragety;

public class FlyWithWin implements FlyingStragety {

	public void performFly() {
		System.out.println("振翅高飞");
	}

}