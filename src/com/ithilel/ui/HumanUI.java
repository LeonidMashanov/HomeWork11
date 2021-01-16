package com.ithilel.ui;


import com.ithilel.utils.HumanList;

public interface HumanUI {


    HumanList readHuman(HumanList humanList);

    void showHumans(HumanList humanList);

    int indexToRemoteHuman();

    String nameToSearch();

    String surnameToSearch();

    void showHumanOfSearch(HumanList list);
}
