package com.raulaquino._1_creational._1_1_factory._1_1_4_halfsimple._1_1_4_factory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.*;

public class _1_1_4_2_IPhoneXFactory extends _1_1_4_1_IPhoneFactory {

    @Override
    IPhone createIPhone(LevelEnum level) {
        return switch (level) {
            case LevelEnum.STANDARD -> new IPhoneX();
            case LevelEnum.HIGHEND -> new IPhoneXSMax();
        };
    }
}
