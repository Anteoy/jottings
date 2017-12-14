package com.anteoy.decisiveBattle.behavier.chainofresponsibility;

/**
 * Created by zhoudazhuang on 17-12-14.
 */
public abstract class AbstractLogger {
    public final int DEBUG = 1;
    public final int INFO = 2;
    public final int ERROR = 3;
    public int level;
    public AbstractLogger nextLogger;



    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void logMsg(int level,String msg);

    public abstract void write(int level,String msg);

}
