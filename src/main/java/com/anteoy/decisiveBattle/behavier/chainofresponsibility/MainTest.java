package com.anteoy.decisiveBattle.behavier.chainofresponsibility;

/**
 * Created by zhoudazhuang on 17-12-14.
 * 推荐做法是把责任链设置链放到main函数里面，INFO DEBUG 等为设置为static final 常量使用,
 * 在构造函数时和main中打印Log两处都传入level，在logMsg中进行对比大小进行输出
 * 但推荐做法的实现和平时使用的Log方式不太相同
 */
public class MainTest {
    public static void main(String[] args) {
        AbstractLogger consoleLogger = new ConsoleLogger();
        consoleLogger.logMsg(4,"test1111");

    }
}
