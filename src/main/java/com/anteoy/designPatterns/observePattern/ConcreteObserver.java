package com.anteoy.designPatterns.observePattern;

/**
 * 具体的观察者对象，实现更新的方法，使自身状态和目标的状态保持一致
 *
 * @Author 周巖 on
 * @Date 2016/3/25.17:55
 */
public class ConcreteObserver implements Observer {
    //观察者状态
    private String observerStates;
    //观察者名字
    private String observerName;
    //天气内容情况
    private String weather;

    public String getObserverStates() {
        return observerStates;
    }

    public void setObserverStates(String observerStates) {
        this.observerStates = observerStates;
    }

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getRemindThing() {
        return remindThing;
    }

    public void setRemindThing(String remindThing) {
        this.remindThing = remindThing;
    }

    //提醒内容
    private String remindThing;

    @Override
    public void update(WeatherSubject subject) {
        // observerStates = ((ConcreteWeatherSubject)subject).getSubjectStates();
        //唯一从目标出获得内容
        weather = ((ConcreteWeatherSubject) subject).getWeather();
        System.out.println(observerName + "收到了" + weather + "," + remindThing);
    }
}
