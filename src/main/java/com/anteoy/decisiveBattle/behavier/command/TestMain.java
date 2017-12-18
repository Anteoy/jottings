package com.anteoy.decisiveBattle.behavier.command;

/**
 * Created by zhoudazhuang on 17-12-18.
 * 命令模式 主要是一个对象stock 命令为接口和子类实现 并且子类组合了stock并调用stock的库存方法，一组有顺序的指令，指令和对象分离，但无论如何分离都必须要是
 * 要有联系 比如此处的组合。主要为了解耦行为的请求者和行为的实现者
 * 三个角色：1、received 真正的命令执行对象（stock） 2、Command（order） 3、invoker 使用命令对象的入口(broken)
 */
public class TestMain {
    public static void main(String[] args) {
        Broker broker = new Broker();
        Stock stock = new Stock();
        broker.takeOrder(new BuyStock(stock));
        broker.takeOrder(new SellStock(stock));
        broker.placeOrder();
    }
}
