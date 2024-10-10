package com.raulaquino._1_creational._1_1_factory._1_1_2_after._1_1_2_factory;

import com.raulaquino._1_creational._1_1_factory.models.IPhone;
import com.raulaquino._1_creational._1_1_factory.models.IPhoneXSMax;

public class _1_1_2_3_IPhoneXSMaxFactory extends _1_1_2_1_IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
