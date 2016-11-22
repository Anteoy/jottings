package com.anteoy.designPatterns.observePattern;

/**
 * 具体的目标对象，负责把有关状态存入到相应的观察者对象中
 * @Author 周巖 on
 * @Date 2016/3/25.17:52
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
        //内容有了，说明天气更新了，通知所有订阅的人
        this.notifyObservers();
    }

    //目标对象状态
    private String weather;
}
