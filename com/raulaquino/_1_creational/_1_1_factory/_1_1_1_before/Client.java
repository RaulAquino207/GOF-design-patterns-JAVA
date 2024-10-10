package com.raulaquino._1_creational._1_1_factory._1_1_1_before;

import com.raulaquino._1_creational._1_1_factory.models.IPhone;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11;
import com.raulaquino._1_creational._1_1_factory.models.IPhoneX;
import com.raulaquino._1_creational._1_1_factory.models.IPhoneXSMax;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11Pro;

public class Client {
    public enum Generation {
        X, XI;
    }

    public enum Level {
        STANDARD, HIGHEND;
    }

    public IPhone orderIPhone(Generation generation, Level level) {
        IPhone device = switch (generation) {
            case X -> switch (level) {
                case STANDARD -> new IPhoneX();
                case HIGHEND -> new IPhoneXSMax();
            };
            case XI -> switch (level) {
                case STANDARD -> new IPhone11();
                case HIGHEND -> new IPhone11Pro();
            };
        };

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println("*** Ordering an IPhone X STANDARD");
        IPhone iphoneX = client.orderIPhone(Generation.X, Level.STANDARD);
        System.out.println(iphoneX);

        System.out.println("*** Ordering an IPhone 11 HIGHEND");
        IPhone iphone11 = client.orderIPhone(Generation.XI, Level.HIGHEND);
        System.out.println(iphone11);
    }
}
