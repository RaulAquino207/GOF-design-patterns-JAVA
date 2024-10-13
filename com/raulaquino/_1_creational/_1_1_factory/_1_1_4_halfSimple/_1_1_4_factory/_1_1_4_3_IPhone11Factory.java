package com.raulaquino._1_creational._1_1_factory._1_1_4_halfSimple._1_1_4_factory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.IPhone;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11;
import com.raulaquino._1_creational._1_1_factory.models.IPhone11Pro;

public class _1_1_4_3_IPhone11Factory extends _1_1_4_1_IPhoneFactory {

    @Override
    IPhone createIPhone(LevelEnum level) {
        return switch (level) {
            case LevelEnum.STANDARD -> new IPhone11();
            case LevelEnum.HIGHEND -> new IPhone11Pro();
        };
    }
}
