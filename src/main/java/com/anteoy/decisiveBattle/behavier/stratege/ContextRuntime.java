package com.anteoy.decisiveBattle.behavier.stratege;

/**
 * Created by zhoudazhuang on 17-12-16.
 */
public class ContextRuntime {
    public Stratege stratege;

    public ContextRuntime(Stratege stratege) {
        this.stratege = stratege;
    }

    public int executeStratege(int a,int b){
        return stratege.doOperation(a,b);
    }
}
