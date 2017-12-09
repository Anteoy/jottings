package com.anteoy.decisiveBattle.created.creator;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class TestMain {
    public static void main(String[] args) {
        Builder  builder= new Builder();
        Meal meal = builder.prepareNonVegMeal();
        meal.count();
        System.out.println(meal.count());
        meal.packing();
    }
}
