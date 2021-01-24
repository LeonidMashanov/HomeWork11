package com.ithilel;

import com.ithilel.Exception.HumanAddException;

import com.ithilel.Exception.NotFoundException;
import com.ithilel.Services.HumanServices;
import com.ithilel.ui.HumanUI;


public class HumanController {
    HumanServices humanServices;
    HumanUI humanUI;

    public HumanController(HumanServices humanServices, HumanUI ui) {
        this.humanServices = humanServices;
        this.humanUI = ui;
    }

    public void removeHumanByIndex() throws NotFoundException{
        int indexToRemote = humanUI.indexToRemoteHuman();
        humanServices.removeHumanByIndex(indexToRemote);
    }

    public void searchBySurname() throws NotFoundException {
        humanUI.showHumanOfSearch(humanServices.searchHuman(humanUI.surnameToSearch()));
    }

    public void searchByName() throws NotFoundException {
        humanUI.showHumanOfSearch(humanServices.searchHuman(humanUI.nameToSearch()));
    }

    public void showHumans() {
        humanUI.showHumans(humanServices.showHumans());
    }

    public void readHuman() {
        try {
            humanUI.readHuman(humanServices.showHumans());
        } catch (HumanAddException e) {
            System.out.println("Such Human is on the list");
        }
    }
}
