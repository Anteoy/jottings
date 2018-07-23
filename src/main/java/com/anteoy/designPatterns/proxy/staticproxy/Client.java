package com.anteoy.designPatterns.proxy.staticproxy;

public class Client {

    /**
     * 测试类 静态代理 代理类Car2(或者Car3)与被代理类Car在之前就是已经确定的，相当于他们共同实现了一个接口，或继承相同的抽象类
     */
    public static void main(String[] args) {
        //使用集成方式
        Moveable m = new Car2();
        m.move();
		/*//使用聚合方式实现
		Car car = new Car();
		Moveable m = new Car3(car);
		m.move();*/
    }

}