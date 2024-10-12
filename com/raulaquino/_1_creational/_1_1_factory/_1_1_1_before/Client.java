package com.raulaquino._1_creational._1_1_factory._1_1_1_before;

import com.raulaquino._1_creational._1_1_factory.enums.GenerationEnum;
import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.IPhone;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11;
import com.raulaquino._1_creational._1_1_factory.models.IPhoneX;
import com.raulaquino._1_creational._1_1_factory.models.IPhoneXSMax;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11Pro;

public class Client {
    public IPhone orderIPhone(GenerationEnum generation, LevelEnum level) {
        IPhone device = switch (generation) {
            case GenerationEnum.X -> switch (level) {
                case LevelEnum.STANDARD -> new IPhoneX();
                case LevelEnum.HIGHEND -> new IPhoneXSMax();
            };
            case GenerationEnum.XI -> switch (level) {
                case LevelEnum.STANDARD -> new IPhone11();
                case LevelEnum.HIGHEND -> new IPhone11Pro();
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

        System.out.println("*** Ordering an IPhone X STANDARD ***");
        IPhone iPhoneX = client.orderIPhone(GenerationEnum.X, LevelEnum.STANDARD);
        System.out.println(iPhoneX);

        System.out.println("*** Ordering an IPhone 11 STANDARD ***");
        IPhone iPhone11 = client.orderIPhone(GenerationEnum.XI, LevelEnum.STANDARD);
        System.out.println(iPhone11);
    }
}
