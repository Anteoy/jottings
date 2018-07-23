package com.anteoy.decisiveBattle.behavier.template;

/**
 * Created by zhoudazhuang on 17-12-17.
 */
public abstract class Game {
    public abstract void init();

    public abstract void startPlay();

    public abstract void endPlay();

    public final void play() {
        init();
        startPlay();
        endPlay();
    }

    ;
}
