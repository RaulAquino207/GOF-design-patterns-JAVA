package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract;

import com.raulaquino._1_creational._1_2_abstractfactory.models.certificate.BrazilianCertificate;
import com.raulaquino._1_creational._1_2_abstractfactory.models.certificate.Certificate;
import com.raulaquino._1_creational._1_2_abstractfactory.models.packing.BrazilianPacking;
import com.raulaquino._1_creational._1_2_abstractfactory.models.packing.Packing;

public class _1_2_1_2_BrazilianRulesAbstractFactory implements _1_2_1_1_CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new BrazilianCertificate();
    }

    @Override
    public Packing getPacking() {
        return new BrazilianPacking();
    }
}
