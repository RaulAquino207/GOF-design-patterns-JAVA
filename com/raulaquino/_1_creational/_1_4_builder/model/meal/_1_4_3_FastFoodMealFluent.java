package com.raulaquino._1_creational._1_4_builder.model.meal;

public class _1_4_3_FastFoodMealFluent {

    private String drink;
    private String main;
    private String side;
    private String dessert;
    private String gift;

    public _1_4_3_FastFoodMealFluent(String drink, String main, String side, String dessert, String gift) {
        this.drink = drink;
        this.main = main;
        this.side = side;
        this.dessert = dessert;
        this.gift = gift;
    }

    public String getDrink() {
        return this.drink;
    }

    public String getMain() {
        return this.main;
    }

    public String getSide() {
        return this.side;
    }

    public String getDessert() {
        return this.dessert;
    }

    public String getGift() {
        return this.gift;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    public void setGift(String gift) {
        this.gift = gift;
    }

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side="
                + side + ", dessert=" + dessert + ", gift=" + gift + "]";
    }

}
