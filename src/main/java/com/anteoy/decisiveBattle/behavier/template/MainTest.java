package com.anteoy.decisiveBattle.behavier.template;

/**
 * Created by zhoudazhuang on 17-12-17.
 * 模板模式 算法固定 具体可由子类改变 但是固定的步骤算法不能改变 模板方法必须是final不能被重写
 */
public class MainTest {
    public static void main(String[] args) {
        Game  game =  new Basketball();
        game.play();
    }
}
