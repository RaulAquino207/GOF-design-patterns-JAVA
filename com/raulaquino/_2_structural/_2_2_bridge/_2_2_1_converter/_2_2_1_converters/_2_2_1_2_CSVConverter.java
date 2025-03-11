package com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_converters;

import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees._2_2_1_1_Employee;

public class _2_2_1_2_CSVConverter implements _2_2_1_1_Converter{
    @Override
    public String getEmployeeFormated(_2_2_1_1_Employee emp) {
        return String.format("%s,%d,%.2f", emp.getName(), emp.getAge(), emp.getSalary());
    }
}
