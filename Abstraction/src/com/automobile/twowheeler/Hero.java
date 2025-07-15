package com.automobile.twowheeler;

import com.automobile.Vehicles;

public class Hero extends Vehicles {
    public String getModelName() {
        return "Hero Splendor";
    }

    public String getRegistrationNumber() {
        return "AP098A3134";
    }

    public String getOwnerName() {
        return "Lakshmi";
    }

    public int getSpeed() {
        return 60;
    }

    public void radio() {
        System.out.println("Hero radio control: ON");
    }
}
