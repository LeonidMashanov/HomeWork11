package com.ithilel.Services;


import com.ithilel.utils.HumanList;

import java.util.Arrays;

public class HumanServices {
    private HumanList humans = new HumanList();

    public HumanList removeHumanByIndex(HumanList humanList, int index) {
        humanList.setToRemote(index-1, humanList, null);
        return humanList;
    }

}



