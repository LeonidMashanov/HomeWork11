package com.ithilel.ui;

import java.util.List;

public interface HumanUI {


    List readHuman(List humanList);

    void showHumans(List humanList);

    int indexToRemoteHuman();

    String nameToSearch();

    String surnameToSearch();

    void showHumanOfSearch(List list);
}
