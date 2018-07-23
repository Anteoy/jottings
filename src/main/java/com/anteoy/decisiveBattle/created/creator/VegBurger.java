package com.anteoy.decisiveBattle.created.creator;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "VegBurger";
    }

    @Override
    public float price() {
        return 1.1f;
    }
}
