package com.raulaquino._1_creational._1_1_factory.models;

public class IPhoneX extends IPhone {
    @Override
    public void getHardware() {
        System.out.println("[IPhone X] Hardware list");
        System.out.println("\t- 5.8in Screen");
        System.out.println("\t- A11 Chipset");
        System.out.println("\t- 3Gb RAM");
        System.out.println("\t- 256Gb Memory");
    }
}
