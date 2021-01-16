package com.ithilel;

import com.ithilel.Services.HumanServices;
import com.ithilel.ui.HumanUI;

public class HumanController {
    HumanServices services;
    HumanUI ui;

    public HumanController(HumanServices services, HumanUI ui) {
        this.services = services;
        this.ui = ui;
    }

    public void removeHumanByIndex() {
        int indexToRemote = ui.indexToRemoteHuman();
        services.removeHumanByIndex(indexToRemote);
    }

    public void searchBySurname() {
        ui.showHumanOfSearch(services.searchHuman(ui.nameToSearch()));
    }

    public void searchByName() {
        ui.showHumanOfSearch(services.searchHuman(ui.nameToSearch()));
    }

    public void showHumans(){
        ui.showHumans(services.showHumans());
    }
    public void readHuman (){
        ui.readHuman(services.showHumans());
    }
}
