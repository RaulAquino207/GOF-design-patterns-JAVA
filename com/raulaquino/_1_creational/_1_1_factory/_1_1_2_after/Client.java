package com.raulaquino._1_creational._1_1_factory._1_1_2_after;

import com.raulaquino._1_creational._1_1_factory._1_1_2_after._1_1_2_factory._1_1_2_1_IPhoneFactory;
import com.raulaquino._1_creational._1_1_factory._1_1_2_after._1_1_2_factory._1_1_2_3_IPhoneXSMaxFactory;
import com.raulaquino._1_creational._1_1_factory._1_1_2_after._1_1_2_factory._1_1_2_5_IPhone11ProFactory;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Ordering an IPhone X HIGHEND");
        _1_1_2_1_IPhoneFactory iPhoneXSMax = new _1_1_2_3_IPhoneXSMaxFactory();
        iPhoneXSMax.orderIPhone();

        System.out.println("*** Ordering an IPhone 11 HIGHEND");
        _1_1_2_1_IPhoneFactory iPhone11Pro = new _1_1_2_5_IPhone11ProFactory();
        iPhone11Pro.orderIPhone();
    }
}
