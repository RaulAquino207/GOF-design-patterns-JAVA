package com.raulaquino._1_creational._1_4_builder._1_4_3_fluent;

import com.raulaquino._1_creational._1_4_builder._1_4_3_fluent._1_4_3_builder._1_4_3_1_FastFoodMealBuilder;
import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_3_FastFoodMealFluent;

public class Client {
    public static void main(String[] args) {

        _1_4_3_FastFoodMealFluent healthyFood = new _1_4_3_1_FastFoodMealBuilder("Salad")
                .addDrink("Water")
                .addMain("Rice and chicken")
                .addDessert("Apple")
                .addGift("Healthy life").thatIsAll();

        System.out.println(healthyFood);

        _1_4_3_FastFoodMealFluent justFries = new _1_4_3_1_FastFoodMealBuilder("Fries")
                .thatIsAll();

        System.out.println(justFries);
    }
}
