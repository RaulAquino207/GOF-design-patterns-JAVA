package com.raulaquino._1_creational._1_2_abstractfactory._1_2_1_abstractfactory._1_2_1_abstract;

import com.raulaquino._1_creational._1_2_abstractfactory.models.certificate.Certificate;
import com.raulaquino._1_creational._1_2_abstractfactory.models.packing.Packing;

public interface _1_2_1_1_CountryRulesAbstractFactory {
    Certificate getCertificates();
    Packing getPacking();
}
