package com.raulaquino._1_creational._1_1_factory._1_1_3_simple;

import com.raulaquino._1_creational._1_1_factory._1_1_3_simple._1_1_3_factory._1_1_3_1_IPhoneSimpleFactory;
import com.raulaquino._1_creational._1_1_factory.enums.GenerationEnum;
import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.iphone.IPhone;

public class Client {
    public static void main(String[] args) {

//        _1_1_3_1_IPhoneSimpleFactory iPhoneSimpleFactory = new _1_1_3_1_IPhoneSimpleFactory();

        System.out.println("*** Ordering an IPhone X STANDARD ***");
        IPhone iPhoneX = _1_1_3_1_IPhoneSimpleFactory.orderIPhone(GenerationEnum.X, LevelEnum.STANDARD);
        System.out.println(iPhoneX);

        System.out.println("*** Ordering an IPhone 11 STANDARD ***");
        IPhone iPhone11 = _1_1_3_1_IPhoneSimpleFactory.orderIPhone(GenerationEnum.XI, LevelEnum.STANDARD);
        System.out.println(iPhone11);
    }
}
