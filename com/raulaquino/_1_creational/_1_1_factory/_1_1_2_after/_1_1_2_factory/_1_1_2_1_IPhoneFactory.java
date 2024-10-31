package com.raulaquino._1_creational._1_1_factory._1_1_2_after._1_1_2_factory;

import com.raulaquino._1_creational._1_1_factory.models.iphone.IPhone;

public abstract class _1_1_2_1_IPhoneFactory {
    public IPhone orderIPhone() {
        IPhone device = null;

        device = createIPhone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIPhone();
}
