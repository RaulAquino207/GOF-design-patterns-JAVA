package com.raulaquino._1_creational._1_1_factory._1_1_3_simple._1_1_3_factory;

import com.raulaquino._1_creational._1_1_factory.enums.GenerationEnum;
import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.*;

public class _1_1_3_1_IPhoneSimpleFactory {
    public static IPhone orderIPhone(GenerationEnum generation, LevelEnum level) {
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
}
