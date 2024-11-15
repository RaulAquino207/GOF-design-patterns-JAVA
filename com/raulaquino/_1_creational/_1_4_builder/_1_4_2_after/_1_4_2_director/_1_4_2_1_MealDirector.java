package com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_director;

import com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder._1_4_2_1_FastFoodMealBuilder;
import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_2_FastFoodMealAfter;

public class _1_4_2_1_MealDirector {

    _1_4_2_1_FastFoodMealBuilder mealBuilder = null;

    public _1_4_2_1_MealDirector(_1_4_2_1_FastFoodMealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public void buildCombo() {
        this.mealBuilder.buildDrink();
        this.mealBuilder.buildMain();
        this.mealBuilder.buildSide();
        this.mealBuilder.buildDessert();
        this.mealBuilder.buildGift();
    }

    public _1_4_2_FastFoodMealAfter getCombo() {
        return this.mealBuilder.getMeal();
    }
}
