package com.anteoy.designPatterns.observePattern;

/**
 * 测试类
 *
 * @Author 周巖 on
 * @Date 2016/3/25.18:34
 */
public class Client {
    public static void main(String[] args) {
        //创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("女朋友");
        observerGirl.setRemindThing("是我们第一次约会，地点街新公园");

        ConcreteObserver observerMum = new ConcreteObserver();
        observerMum.setObserverName("老妈");
        observerMum.setRemindThing("是一个购物的好日子，明天去扫货");
        //注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMum);
        //目标发布天气
        weather.setWeather("明天天气晴朗，蓝天白云，气温二十八度");
    }
}
