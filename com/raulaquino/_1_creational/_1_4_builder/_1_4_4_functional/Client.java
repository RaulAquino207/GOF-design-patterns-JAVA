package com.raulaquino._1_creational._1_4_builder._1_4_4_functional;

/*
* The idea of functional is to be basically what fluent is,
* but applying something more focused on the functional paradigm
* of the thing with a BUILDER class within the model class.
* */

import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_4_FastFoodMealFunctional;

public class Client {
    public static void main(String[] args) {
        _1_4_4_FastFoodMealFunctional healthyFood = new _1_4_4_FastFoodMealFunctional.Builder("Salad")
                .addDrink("Water")
                .addMain("Rice and chicken")
                .addDessert("Apple")
                .addGift("Healthy life").thatIsAll();

        System.out.println(healthyFood);

        _1_4_4_FastFoodMealFunctional justFries = new _1_4_4_FastFoodMealFunctional.Builder("Fries")
                .thatIsAll();

        System.out.println(justFries);
    }
}
