package com.ithilel.ui;

import com.ithilel.Exception.HumanAddException;

import java.util.List;

public interface HumanUI {

    List readHuman(List humanList) throws HumanAddException;

    void showHumans(List humanList);

    int indexToRemoteHuman();

    String nameToSearch();

    String surnameToSearch();

    void showHumanOfSearch(List list);
}
