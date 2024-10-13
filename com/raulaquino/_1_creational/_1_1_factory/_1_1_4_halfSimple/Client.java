package com.raulaquino._1_creational._1_1_factory._1_1_4_halfSimple;

import com.raulaquino._1_creational._1_1_factory._1_1_4_halfSimple._1_1_4_factory._1_1_4_1_IPhoneFactory;
import com.raulaquino._1_creational._1_1_factory._1_1_4_halfSimple._1_1_4_factory._1_1_4_2_IPhoneXFactory;
import com.raulaquino._1_creational._1_1_factory._1_1_4_halfSimple._1_1_4_factory._1_1_4_3_IPhone11Factory;
import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.IPhone;

public class Client {
    public static void main(String[] args) {
        _1_1_4_1_IPhoneFactory iPhoneXFactory = new _1_1_4_2_IPhoneXFactory();
        _1_1_4_1_IPhoneFactory iPhone11Factory = new _1_1_4_3_IPhone11Factory();

        System.out.println("*** Ordering an IPhone X HIGHEND");
        IPhone iPhoneXSMax = iPhoneXFactory.orderIPhone(LevelEnum.HIGHEND);
        System.out.println(iPhoneXSMax);

        System.out.println("*** Ordering an IPhone 11 HIGHEND");
        IPhone iPhone11Pro = iPhone11Factory.orderIPhone(LevelEnum.HIGHEND);
        System.out.println(iPhone11Pro);
    }
}
