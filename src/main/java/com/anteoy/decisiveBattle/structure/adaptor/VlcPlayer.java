package com.anteoy.decisiveBattle.structure.adaptor;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playvlc() {
        System.out.println("播放vlc");
    }

    @Override
    public void playmp4() {
        System.out.println("不能播放mp4");
    }
}
