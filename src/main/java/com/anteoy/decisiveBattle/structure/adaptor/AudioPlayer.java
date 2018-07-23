package com.anteoy.decisiveBattle.structure.adaptor;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
public class AudioPlayer implements MediaPlayer {
    public static MediaAdaptor mediaAdaptor = new MediaAdaptor();

    @Override
    public void play() {
        System.out.println("播放mp3格式");
    }

}
