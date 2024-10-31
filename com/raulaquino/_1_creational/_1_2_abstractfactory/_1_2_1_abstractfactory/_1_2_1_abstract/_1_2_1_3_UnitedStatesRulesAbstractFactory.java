package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract;

import com.raulaquino._1_creational._1_2_abstractfactory.models.certificate.Certificate;
import com.raulaquino._1_creational._1_2_abstractfactory.models.certificate.UnitedStatesCertificate;
import com.raulaquino._1_creational._1_2_abstractfactory.models.packing.Packing;
import com.raulaquino._1_creational._1_2_abstractfactory.models.packing.UnitedStatesPacking;

public class _1_2_1_3_UnitedStatesRulesAbstractFactory implements _1_2_1_1_CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new UnitedStatesCertificate();
    }

    @Override
    public Packing getPacking() {
        return new UnitedStatesPacking();
    }
}
