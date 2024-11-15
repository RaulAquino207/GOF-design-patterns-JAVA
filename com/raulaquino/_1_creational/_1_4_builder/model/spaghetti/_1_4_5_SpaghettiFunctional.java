package com.raulaquino._1_creational._1_4_builder.model.spaghetti;

import com.raulaquino._1_creational._1_4_builder.enums.Size;

import java.util.List;

public class _1_4_5_SpaghettiFunctional {

    final private Size size;
    final private List<String> toppings;
    final private boolean cheese;

    public _1_4_5_SpaghettiFunctional(Size size,List<String> toppings, boolean cheese) {
        this.size = size;
        this.toppings = toppings;
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pasta size=" + size +  " [toppings=" + toppings + ", cheese=" + cheese + "]";
    }

    public static class Builder {

        //    Mandatory
        private Size size;

        //    Optional
        private List<String> toppings;
        private boolean cheese;

        public Builder(Size size) {
            this.setSize(size);
        }

        public Builder setSize(Size size) {
            this.size = size;
            return this;
        }

        public Builder setToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public Builder setCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public _1_4_5_SpaghettiFunctional order() {
            return new _1_4_5_SpaghettiFunctional(this.size, this.toppings, this.cheese);
        }
    }
}
