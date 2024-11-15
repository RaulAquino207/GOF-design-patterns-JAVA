package com.raulaquino._1_creational._1_4_builder.model.meal;

public class _1_4_4_FastFoodMealFunctional {

    private final String drink;
    private final String main;
    private final String side;
    private final String dessert;
    private final String gift;

    public _1_4_4_FastFoodMealFunctional(String drink, String main, String side, String dessert, String gift) {
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

    @Override
    public String toString() {
        return "Combo [drink=" + drink + ", main=" + main + ", side="
                + side + ", dessert=" + dessert + ", gift=" + gift + "]";
    }

//    Inner Class
    public static class Builder {

        //    Mandatory
        private String side;

        //    Optional
        private String drink;
        private String main;
        private String dessert;
        private String gift;

        public Builder(String side) {
            this.addSide(side);
        }

        public Builder addDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder addMain(String main) {
            this.main = main;
            return this;
        }

        public Builder addSide(String side) {
            this.side = side;
            return this;
        }

        public Builder addDessert(String dessert) {
            this.dessert = dessert;
            return this;
        }

        public Builder addGift(String gift) {
            this.gift = gift;
            return this;
        }

        public _1_4_4_FastFoodMealFunctional thatIsAll() {
            return new _1_4_4_FastFoodMealFunctional(this.drink, this.main, this.side, this.dessert, this.gift);
        }
    }
}
