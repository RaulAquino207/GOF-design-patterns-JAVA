package com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_2_devices;

import com.raulaquino._2_structural._2_1_adapter._2_1_1_tvport._2_1_1_1_interfaces._2_1_1_1_1_HDMI;

public class _2_1_1_2_3_Computer {
    private _2_1_1_1_1_HDMI port;

    public void connectPort(_2_1_1_1_1_HDMI screen) {
        System.out.println("Connecting on HDMI port...");
        this.port = screen;
    }

    public void sendImageAndSound(String image, String sound) {
        if (this.port == null) {
            System.out.println("Connect a HDMI cable first");
        } else {
            this.port.setImage(image);
            this.port.setSound(sound);
        }
    }
}
