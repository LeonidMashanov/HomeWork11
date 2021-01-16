package com.ithilel.ui;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

public interface HumanUI {

     boolean suchAList(HumanList humanList, Human h);
     HumanList readHuman(HumanList humanList);
     void showHumans(HumanList humanList);
     int indexToRemoteHuman();
     String nameToSearch();
    void showHumanOfSearch(HumanList list);
}
