package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_1_CountryRulesAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_2_BrazilianRulesAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract._1_2_1_3_UnitedStatesRulesAbstractFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_factory._1_2_1_1_PhoneFactory;
import com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_factory._1_2_1_2_IPhoneXFactory;
import com.raulaquino._1_creational._1_2_abstractfactory.models.iphone.IPhone;

public class Client {
    public static void main(String[] args) {
        _1_2_1_1_CountryRulesAbstractFactory brazilianRules = new _1_2_1_2_BrazilianRulesAbstractFactory();
        _1_2_1_1_CountryRulesAbstractFactory unitedStatesRules = new _1_2_1_3_UnitedStatesRulesAbstractFactory();

        _1_2_1_1_PhoneFactory iPhoneXFactory = new _1_2_1_2_IPhoneXFactory(brazilianRules);
        _1_2_1_1_PhoneFactory iPhone11Factory = new _1_2_1_2_IPhoneXFactory(unitedStatesRules);

        System.out.println("*** Ordering an IPhone X STANDARD ***");
        IPhone iPhoneX = iPhoneXFactory.orderIphone(LevelEnum.STANDARD);
        System.out.println(iPhoneX);

        System.out.println("*** Ordering an IPhone 11 HIGHEND ***");
        IPhone iPhone11Pro = iPhone11Factory.orderIphone(LevelEnum.HIGHEND);
        System.out.println(iPhone11Pro);
    }
}
