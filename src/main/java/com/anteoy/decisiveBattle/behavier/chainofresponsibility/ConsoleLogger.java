package com.anteoy.decisiveBattle.behavier.chainofresponsibility;

/**
 * Created by zhoudazhuang on 17-12-14.
 */
public class ConsoleLogger extends AbstractLogger{

//    public ConsoleLogger(int level) {
//        this.level = level;
//    }


    @Override
    public void logMsg(int level,String msg) {
        if (1 <= level && level <= 3 ) {
            System.out.println("1111111111");
        }else{
            write(level,msg);
        }
    }


    @Override
    public void write(int level,String msg) {
        this.setNextLogger(new FileLogger(2));
        nextLogger.logMsg(level,msg);
    }
}
