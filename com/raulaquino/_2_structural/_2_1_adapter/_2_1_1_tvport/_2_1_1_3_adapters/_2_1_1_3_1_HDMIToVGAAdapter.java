package com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_3_adapters;

import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_1_interfaces._2_1_1_1_1_HDMI;
import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_1_interfaces._2_1_1_1_2_VGA;

//Object Adapter
public class _2_1_1_3_1_HDMIToVGAAdapter implements _2_1_1_1_1_HDMI {
    private _2_1_1_1_2_VGA vga;

    public _2_1_1_3_1_HDMIToVGAAdapter(_2_1_1_1_2_VGA vga) {
        System.out.println("Connecting the HDMI/VGA adapter...");
        this.vga = vga;
    }

    @Override
    public void setImage(String image) {
        System.out.println("Converting the image from HDMI to VGA");
        vga.setImage(image);
    }

    @Override
    public void setSound(String sound) {
        System.out.println("Sorry, We do not work with sound");
    }
}
