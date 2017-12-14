package com.anteoy.decisiveBattle.behavier.chainofresponsibility;

/**
 * Created by zhoudazhuang on 17-12-14.
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void logMsg(int level,String msg) {
        write(level,msg);
    }

    @Override
    public void write(int level,String msg) {
        System.out.println("finished error write..."+msg);
    }
}
