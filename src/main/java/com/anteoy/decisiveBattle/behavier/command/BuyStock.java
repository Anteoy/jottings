package com.anteoy.decisiveBattle.behavier.command;

/**
 * Created by zhoudazhuang on 17-12-18.
 */
public class BuyStock implements Order{
    Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
