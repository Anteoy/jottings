package com.anteoy.decisiveBattle.behavier.chainofresponsibility;

/**
 * Created by zhoudazhuang on 17-12-14.
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    public void logMsg(int level, String msg) {
        if (4 <= level && level <= 6) {
            System.out.println("1111111111");
        } else {
            write(level, msg);
        }
    }

    @Override
    public void write(int level, String msg) {
        this.setNextLogger(new ErrorLogger(3));
        nextLogger.logMsg(level, msg);
    }
}
