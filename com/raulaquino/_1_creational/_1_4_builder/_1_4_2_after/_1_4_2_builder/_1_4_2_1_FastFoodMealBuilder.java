package com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder;

import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_2_FastFoodMealAfter;

public abstract class _1_4_2_1_FastFoodMealBuilder {

    protected _1_4_2_FastFoodMealAfter meal;

    public _1_4_2_1_FastFoodMealBuilder() {
        this.meal = new _1_4_2_FastFoodMealAfter();
    }

    public _1_4_2_FastFoodMealAfter getMeal() {
        return this.meal;
    }

    public abstract void buildDrink();
    public abstract void buildMain();
    public abstract void buildSide();
    public abstract void buildDessert();
    public abstract void buildGift();
}
