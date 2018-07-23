package com.anteoy.decisiveBattle.structure.adaptor;

/**
 * Created by zhoudazhuang on 17-12-10.
 */
//注意 这里的实现audioPlayer.mediaAdaptor.play() 应该封装到audio 的play方法中 使用flag来表示播放什么格式的文件，这里在main方法中调用适配器进行
//适配，这违背了开放封闭原则 单一职责原则
public class TestMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play();
        audioPlayer.mediaAdaptor.play();
    }
}
