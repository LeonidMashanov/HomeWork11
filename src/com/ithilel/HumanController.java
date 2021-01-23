package com.ithilel;

import com.ithilel.Services.HumanServices;
import com.ithilel.ui.HumanUI;

import java.util.List;

public class HumanController {
    HumanServices humanServices;
    HumanUI humanUI;

    public HumanController(HumanServices humanServices, HumanUI ui) {
        this.humanServices = humanServices;
        this.humanUI = ui;
    }

    public void removeHumanByIndex() {
        int indexToRemote = humanUI.indexToRemoteHuman();
        humanServices.removeHumanByIndex(indexToRemote);
    }

    public void searchBySurname() {
        humanUI.showHumanOfSearch((List) humanServices.searchHuman(humanUI.surnameToSearch()));
    }

    public void searchByName() {
        humanUI.showHumanOfSearch((List) humanServices.searchHuman(humanUI.nameToSearch()));
    }

    public void showHumans() {
        humanUI.showHumans((List) humanServices.showHumans());
    }

    public void readHuman() {
        humanUI.readHuman((List) humanServices.showHumans());
    }
}
