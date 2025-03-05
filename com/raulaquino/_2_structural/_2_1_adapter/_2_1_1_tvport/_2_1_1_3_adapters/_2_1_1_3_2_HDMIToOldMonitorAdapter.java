package com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_3_adapters;

import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_1_interfaces._2_1_1_1_1_HDMI;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices._2_1_1_2_2_OldMonitor;

public class _2_1_1_3_2_HDMIToOldMonitorAdapter extends _2_1_1_2_2_OldMonitor implements _2_1_1_1_1_HDMI {

    public _2_1_1_3_2_HDMIToOldMonitorAdapter() {
        super();
        System.out.println("Wrapping the VGA's OldMonitor's Interface with a HDMI adapter.");
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        super.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We do not work with sound");
    }
}
