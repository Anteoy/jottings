package com.anteoy.decisiveBattle.behavier.command;

/**
 * Created by zhoudazhuang on 17-12-18.
 * 库存类
 */
public class Stock {
    String name = "ribenren";
    int quantity = 20;

    void buy() {
        System.out.println("stock name:" + name + "quantity:" + quantity + "boy");
    }

    void sell() {
        System.out.println("stock name:" + name + "quantity:" + quantity + "sell");
    }
}
