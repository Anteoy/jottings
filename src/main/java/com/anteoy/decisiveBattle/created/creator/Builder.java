package com.anteoy.decisiveBattle.created.creator;

/**
 * Created by zhoudazhuang on 17-12-9.
 */
public class Builder {
        public Meal prepareVegMeal(){
            Meal meal = new Meal();
            meal.items.add(new VegBurger());
            return meal;
        }

        public Meal prepareNonVegMeal(){
            Meal meal = new Meal();
            meal.items.add(new Pepsi());
            return meal;
        }
}
