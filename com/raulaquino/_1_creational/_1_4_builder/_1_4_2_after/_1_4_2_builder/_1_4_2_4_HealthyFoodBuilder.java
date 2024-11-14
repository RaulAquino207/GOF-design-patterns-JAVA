package com.raulaquino._1_creational._1_4_builder._1_4_2_after._1_4_2_builder;

public class _1_4_2_4_HealthyFoodBuilder extends _1_4_2_1_FastFoodMealBuilder{
    @Override
    public void buildDrink() {
        this.meal.setDrink("Water");
    }

    @Override
    public void buildMain() {
        this.meal.setMain("Rice and chicken");
    }

    @Override
    public void buildSide() {
        this.meal.setSide("Salad");
    }

    @Override
    public void buildDessert() {
        this.meal.setDessert("Apple");
    }

    @Override
    public void buildGift() {
        this.meal.setGift("Healthy life");
    }
}
