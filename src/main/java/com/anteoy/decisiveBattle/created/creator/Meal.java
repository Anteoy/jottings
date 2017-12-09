package com.anteoy.decisiveBattle.created.creator;

import java.util.ArrayList;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class Meal {
    public ArrayList<Item> items = new ArrayList<>();

    public String name(String mealName){
        System.out.println("meal_name = "+mealName);
        return mealName;
    }

    public Packing packing(){
        for (Item i:items) {
            System.out.println("name:"+i.name() + ",packing:");
            i.packing().packingType();
        }
        return null;
    }

    public float count(){
        float tmp = 0;
        for (Item a:items) {
            tmp+=a.price();
        }
        return tmp;
    }

}
