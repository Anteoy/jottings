package com.anteoy.decisiveBattle.behavier.stratege;

/**
 * Created by zhoudazhuang on 17-12-16.
 * perfect
 */
public class MainTest {
    public static void main(String[] args) {
        ContextRuntime contextRuntime = new ContextRuntime(new AddStratege());
        System.out.println(contextRuntime.executeStratege(3,2));
    }
}
