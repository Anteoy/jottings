package com.anteoy.decisiveBattle.behavier.template;

/**
 * Created by zhoudazhuang on 17-12-17.
 */
public class FootBall extends Game {
    @Override
    public void init() {
        System.out.println("football init...");
    }

    @Override
    public void startPlay() {
        System.out.println("start play football");
    }

    @Override
    public void endPlay() {
        System.out.println("end play football");
    }

}
