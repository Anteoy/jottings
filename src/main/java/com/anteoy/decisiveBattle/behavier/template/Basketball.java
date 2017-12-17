package com.anteoy.decisiveBattle.behavier.template;

/**
 * Created by zhoudazhuang on 17-12-17.
 */
public class Basketball extends Game{
    @Override
    public void init() {
        System.out.println("basketball init ...");
    }

    @Override
    public void  startPlay() {
        System.out.println("start play basketball");
    }

    @Override
    public void endPlay() {
        System.out.println("end play basketball");
    }

}
