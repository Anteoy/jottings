package com.anteoy.decisiveBattle.behavier.stratege;

/**
 * Created by zhoudazhuang on 17-12-16.
 */
public class SubStratege implements Stratege{
    @Override
    public int doOperation(int a,int b) {
        return a/b;
    }
}
