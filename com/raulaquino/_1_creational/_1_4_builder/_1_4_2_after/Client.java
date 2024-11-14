package com.raulaquino._1_creational._1_4_builder._1_4_2_after;

import com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder._1_4_2_1_FastFoodMealBuilder;
import com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder._1_4_2_2_FatMealBuilder;
import com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder._1_4_2_3_JustFriesBuilder;
import com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder._1_4_2_4_HealthyFoodBuilder;

public class Client {
    public static void main(String[] args) {
        _1_4_2_1_FastFoodMealBuilder fastFoodMealBuilder = new _1_4_2_2_FatMealBuilder();
        fastFoodMealBuilder.buildDrink();
        fastFoodMealBuilder.buildSide();
        fastFoodMealBuilder.buildDessert();

        System.out.println(fastFoodMealBuilder.getMeal());

        _1_4_2_1_FastFoodMealBuilder justFriesBuilder = new _1_4_2_3_JustFriesBuilder();
        justFriesBuilder.buildSide();
        justFriesBuilder.buildDessert();

        System.out.println(justFriesBuilder.getMeal());

        _1_4_2_1_FastFoodMealBuilder healthyFoodBuilder = new _1_4_2_4_HealthyFoodBuilder();
        healthyFoodBuilder.buildDrink();
        healthyFoodBuilder.buildMain();
        healthyFoodBuilder.buildSide();
        healthyFoodBuilder.buildDessert();
        healthyFoodBuilder.buildGift();

        System.out.println(healthyFoodBuilder.getMeal());
    }
}
