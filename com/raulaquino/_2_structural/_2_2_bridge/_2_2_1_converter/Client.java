package com.raulaquino._2_structural._2_2_bridge._2_2_1_converter;

import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_converters._2_2_1_1_Converter;
import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_converters._2_2_1_2_CSVConverter;
import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_converters._2_2_1_3_JsonConverter;
import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees._2_2_1_1_Employee;
import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees._2_2_1_2_ITGuy;
import com.raulaquino._2_structural._2_2_bridge._2_2_1_converter._2_2_1_employees._2_2_1_3_ProjectManager;

public class Client {
    public static void main(String[] args) {
        _2_2_1_1_Converter csvConverter = new _2_2_1_2_CSVConverter();
        _2_2_1_1_Converter jsonConverter = new _2_2_1_3_JsonConverter();

        _2_2_1_1_Employee it = new _2_2_1_2_ITGuy("Raul Aquino", 25, 12000d);
        _2_2_1_1_Employee pm = new _2_2_1_3_ProjectManager("Jen Barber", 40, 60000d);

        System.out.println(csvConverter.getEmployeeFormated(it));
        System.out.println(jsonConverter.getEmployeeFormated(it));
        System.out.println(csvConverter.getEmployeeFormated(pm));
        System.out.println(jsonConverter.getEmployeeFormated(pm));
    }
}
