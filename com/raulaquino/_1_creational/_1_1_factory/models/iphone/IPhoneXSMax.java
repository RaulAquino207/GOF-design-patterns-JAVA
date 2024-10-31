package com.raulaquino._1_creational._1_1_factory.models.iphone;

public class IPhoneXSMax extends IPhone {
    @Override
    public void getHardware() {
        System.out.println("[IPhone XS Max] Hardware list");
        System.out.println("\t- 6.5in Screen");
        System.out.println("\t- A12 Chipset");
        System.out.println("\t- 4Gb RAM");
        System.out.println("\t- 512Gb Memory");
    }
}
