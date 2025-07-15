package com.automobile.twowheeler;

import com.automobile.Vehicles;

public class Honda extends Vehicles {
    public String getModelName() {
        return "Honda Activa";
    }

    public String getRegistrationNumber() {  // ✅ Fixed spelling
        return "AP29CD865";
    }

    public String getOwnerName() {
        return "Tulasi";
    }

    public int getSpeed() {  // ✅ Capital 'S'
        return 55;
    }

    public void cdplayer() {
        System.out.println("Honda CD player: playing");
    }
}
