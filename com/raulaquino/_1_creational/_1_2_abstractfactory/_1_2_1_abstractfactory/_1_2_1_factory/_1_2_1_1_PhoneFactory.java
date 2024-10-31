package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_factory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_1_CountryRulesAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory.models.iphone.IPhone;

public abstract class _1_2_1_1_PhoneFactory {
    _1_2_1_1_CountryRulesAbstractFactory rules;

    public _1_2_1_1_PhoneFactory(_1_2_1_1_CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public IPhone orderIphone(LevelEnum level) {
        IPhone device = null;

        device = createIPhone(level);
        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public abstract IPhone createIPhone(LevelEnum level);

}
