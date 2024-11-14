package com.raulaquino._1_creational._1_4_builder._1_4_1_before;

import com.raulaquino._1_creational._1_4_builder.model.meal._1_4_1_FastFoodMealBefore;

public class Client {
    public static void main(String[] args) {
        _1_4_1_FastFoodMealBefore burgerCombo = new _1_4_1_FastFoodMealBefore("Coke", "CheeseBurger", "Fries");
        System.out.println(burgerCombo);

        _1_4_1_FastFoodMealBefore justFries = new _1_4_1_FastFoodMealBefore(null, null, "Fries");
        System.out.println(justFries);

        _1_4_1_FastFoodMealBefore heartAttackCombo = new _1_4_1_FastFoodMealBefore("Milk Shake", "Monster Burger", "Large Fries", "Fudge Cake", "2 Kilos");
        System.out.println(heartAttackCombo);
    }
}
