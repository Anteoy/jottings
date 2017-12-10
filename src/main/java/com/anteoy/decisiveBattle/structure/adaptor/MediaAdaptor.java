package com.anteoy.decisiveBattle.structure.adaptor;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
//适配器继承或组合高级播放器  实现低级播放器
public class MediaAdaptor implements MediaPlayer{
    private static AdvancedMediaPlayer advancedMediaPlayer = new Mp4Player();

    @Override
    public void play() {
        advancedMediaPlayer.playmp4();
    }
}
