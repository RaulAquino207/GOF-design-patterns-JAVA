package com.raulaquino._1_creational._1_2_abstractfactory.models.iphone;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_1_CountryRulesAbstractFactory;

public class IPhoneX extends IPhone {
    public IPhoneX(_1_2_1_1_CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("[IPhone X] Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
