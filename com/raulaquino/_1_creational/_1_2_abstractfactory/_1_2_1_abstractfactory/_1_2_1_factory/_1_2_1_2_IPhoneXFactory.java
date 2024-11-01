package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_factory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_1_CountryRulesAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory.models.iphone.IPhone;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory.models.iphone.IPhone11;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory.models.iphone.IPhone11Pro;

public class _1_2_1_2_IPhoneXFactory extends _1_2_1_1_PhoneFactory {

    public _1_2_1_2_IPhoneXFactory(_1_2_1_1_CountryRulesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public IPhone createIPhone(LevelEnum level) {
        IPhone device = null;
        device = switch (level) {
            case LevelEnum.STANDARD -> new IPhone11(rules);
            case LevelEnum.HIGHEND -> new IPhone11Pro(rules);
        };

        return device;
    }
}
