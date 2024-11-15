package com.raulaquino._1_creational._1_4_builder._1_4_5_spaghettifunctional;

import com.raulaquino._1_creational._1_4_builder.enums.Size;
import com.raulaquino._1_creational._1_4_builder.model.spaghetti._1_4_5_SpaghettiFunctional;

import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {

        _1_4_5_SpaghettiFunctional spaghetti = new _1_4_5_SpaghettiFunctional.Builder(Size.SMALL)
                .setToppings(Arrays.asList("Bacon", "Broccoli"))
                .setCheese(true)
                .order();

        System.out.println(spaghetti);
    }
}
