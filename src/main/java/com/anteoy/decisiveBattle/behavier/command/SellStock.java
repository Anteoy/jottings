package com.anteoy.decisiveBattle.behavier.command;

/**
 * Created by zhoudazhuang on 17-12-18.
 */
public class SellStock implements Order {
    Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
