package com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices;

import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_1_interfaces._2_1_1_1_2_VGA;

public class _2_1_1_2_2_OldMonitor implements _2_1_1_1_2_VGA {
    @Override
    public void setImage(String image) {
        System.out.println(">>> This is your video: " + image);
    }
}
