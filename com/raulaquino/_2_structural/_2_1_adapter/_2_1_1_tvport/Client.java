package com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport;

import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices._2_1_1_2_1_TV;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices._2_1_1_2_2_OldMonitor;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices._2_1_1_2_3_Computer;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_3_adapters._2_1_1_3_1_HDMIToVGAAdapter;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_3_adapters._2_1_1_3_2_HDMIToOldMonitorAdapter;

public class Client {
    public static void main(String[] args) {

        System.out.println("------ perfect setting ------");
        _2_1_1_2_3_Computer computer1 = new _2_1_1_2_3_Computer();
        _2_1_1_2_1_TV tv = new _2_1_1_2_1_TV();

        computer1.connectPort(tv);
        computer1.sendImageAndSound("Cat and rainbow", "Nyan cat song");
        System.out.println();
        System.out.println("------ with object adapter ------");

        _2_1_1_2_3_Computer computer2 = new _2_1_1_2_3_Computer();
        _2_1_1_2_2_OldMonitor oldMonitor = new _2_1_1_2_2_OldMonitor();
        /*
        * This line will return an error because oldMonitor implements VGA and not HDMI.
        * computer2.connectPort(oldMonitor);
         * */

        // Object Adapter _2_1_1_3_1_HDMIToVGAAdapter
        computer2.connectPort(new _2_1_1_3_1_HDMIToVGAAdapter(oldMonitor));
        computer2.sendImageAndSound("Cat and rainbow", "Nyan cat song");

        System.out.println();
        System.out.println("------ with class adapter ------");

        // Class Adapter _2_1_1_3_2_HDMIToOldMonitorAdapter
        _2_1_1_2_3_Computer computer3 = new _2_1_1_2_3_Computer();
        _2_1_1_3_2_HDMIToOldMonitorAdapter oldMonitorAdapter = new _2_1_1_3_2_HDMIToOldMonitorAdapter();
        computer3.connectPort(oldMonitorAdapter);
        computer3.sendImageAndSound("Cat and rainbow", "Nyan cat song");
    }
}
