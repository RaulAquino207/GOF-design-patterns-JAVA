package com.raulaquino._1_creational._1_4_builder._1_4_3_fluent._1_4_3_builder;

import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_3_FastFoodMealFluent;

public class _1_4_3_1_FastFoodMealBuilder {

    //Mandatory
    private String side;

    private String drink;
    private String main;
    private String dessert;
    private String gift;

    public _1_4_3_1_FastFoodMealBuilder(String side) {
        this.addSide(side);
    }

    public _1_4_3_1_FastFoodMealBuilder addDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public _1_4_3_1_FastFoodMealBuilder addMain(String main) {
        this.main = main;
        return this;
    }

    public _1_4_3_1_FastFoodMealBuilder addSide(String side) {
        this.side = side;
        return this;
    }

    public _1_4_3_1_FastFoodMealBuilder addDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public _1_4_3_1_FastFoodMealBuilder addGift(String gift) {
        this.gift = gift;
        return this;
    }

    public _1_4_3_FastFoodMealFluent thatIsAll() {
        return new _1_4_3_FastFoodMealFluent(this.drink, this.main, this.side, this.dessert, this.gift);
    }
}
