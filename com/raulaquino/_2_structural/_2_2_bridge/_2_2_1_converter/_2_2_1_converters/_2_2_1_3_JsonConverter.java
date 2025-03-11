package com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_converters;

import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees._2_2_1_1_Employee;

public class _2_2_1_3_JsonConverter implements _2_2_1_1_Converter {
    @Override
    public String getEmployeeFormated(_2_2_1_1_Employee emp) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n")
                .append("\t\"name\": \"").append(emp.getName()).append("\",\n")
                .append("\t\"age\": \"").append(emp.getAge()).append("\",\n")
                .append("\t\"salary\": \"").append(emp.getSalary()).append("\"\n")
                .append("}");

        return builder.toString();
    }
}
