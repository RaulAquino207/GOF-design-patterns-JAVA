package com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder;

public class _1_4_2_2_FatMealBuilder extends _1_4_2_1_FastFoodMealBuilder {
    @Override
    public void buildDrink() {
        this.meal.setDrink("Milk Shake");
    }

    @Override
    public void buildMain() {
        this.meal.setMain("Monster Burger");
    }

    @Override
    public void buildSide() {
        this.meal.setSide("Large Fries");
    }

    @Override
    public void buildDessert() {
        this.meal.setDessert("Fudge Cake");
    }

    @Override
    public void buildGift() {
        this.meal.setGift("2 Kilos");
    }
}
