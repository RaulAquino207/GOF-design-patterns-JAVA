package com.raulaquino._1_creational._1_2_abstractfactory.models.iphone;

import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_1_CountryRulesAbstractFactory;

public class IPhone11Pro extends IPhone {
    public IPhone11Pro(_1_2_1_1_CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void getHardware() {
        System.out.println("[IPhone 11 Pro] Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A13 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
