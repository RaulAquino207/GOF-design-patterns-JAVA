package com.raulaquino._1_creational._1_4_builder.model.meal;

public class _1_4_1_FastFoodMealBefore {
    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    //Too many constructors and it does not make sense

    public _1_4_1_FastFoodMealBefore(String drink) {
        this.drink = drink;
    }

    public _1_4_1_FastFoodMealBefore(String drink, String main) {
        this.drink = drink;
        this.main = main;
    }

    public _1_4_1_FastFoodMealBefore(String drink, String main, String side) {
        this.drink = drink;
        this.main = main;
        this.side = side;
    }

    public _1_4_1_FastFoodMealBefore(String drink, String main, String side, String dessert) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
    }

    public _1_4_1_FastFoodMealBefore(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public String getGift() {
        return gift;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
                + gift + "]";
    }
}
