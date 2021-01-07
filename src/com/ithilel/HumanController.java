package com.ithilel;

import com.ithilel.Services.HumanServices;
import com.ithilel.ui.HumanUI;
import com.ithilel.utils.HumanList;


public class HumanController {
    HumanServices services;
    HumanUI ui;
    HumanList list;

    public HumanController(HumanServices services, HumanUI ui) {
        this.services = services;
        this.ui = ui;
    }

    public HumanList removeHumanByIndex(HumanList humanList) {
        int indexToRemote = ui.indexToRemoteHuman();
        services.removeHumanByIndex(humanList, indexToRemote);
        return humanList;
    }

    public void searchBySurname(HumanList humanList, String surname) {
        ui.showHumanOfSearch(humanList, services.searchBySurname(humanList, surname));
    }

    public void searchByName(HumanList humanList, String name) {
        ui.showHumanOfSearch(humanList, services.searchByName(humanList, name));
    }

    @Override
    public String toString() {
        return "HumanController{" +
                "services=" + services +
                ", list=" + list +
                '}';
    }
}
