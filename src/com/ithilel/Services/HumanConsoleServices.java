package com.ithilel.Services;

import com.ithilel.utils.HumanList;

public class HumanConsoleServices implements HumanServices {
    private HumanList humans = new HumanList();

    @Override
    public void removeHumanByIndex(int index) {
        humans.removeByIndex(index - 1);
    }

    @Override
    public HumanList searchHuman(String search) {
        return humans.searchHuman(search);
    }

    @Override
    public HumanList showHumans() {
        return humans;
    }

}



