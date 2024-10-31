package com.raulaquino._1_creational._1_1_factory._1_1_4_halfsimple._1_1_4_factory;

import com.raulaquino._1_creational._1_1_factory.enums.LevelEnum;
import com.raulaquino._1_creational._1_1_factory.models.iphone.IPhone;

public abstract class _1_1_4_1_IPhoneFactory {

    abstract IPhone createIPhone(LevelEnum level);

    public IPhone orderIPhone(LevelEnum level) {
        IPhone device = null;

        device = createIPhone(level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
}
