package com.anteoy.decisiveBattle.behavier.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhoudazhuang on 17-12-18.
 */
public class Broker {
    List<Order> orderList = new ArrayList<Order>();

    void takeOrder(Order order){
        orderList.add(order);
    }

    void placeOrder(){
        orderList.forEach(a -> a.execute());
    }
}
