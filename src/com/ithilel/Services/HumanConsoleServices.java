package com.ithilel.Services;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

public class HumanConsoleServices implements HumanServices{
    private HumanList humans = new HumanList();
    @Override
    public HumanList removeHumanByIndex( int index) {
        HumanList list = new HumanList();
        int newIndex = 0;
        humans.setToRemote(index - 1, humans, null);
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i) != null) {
                Human h = humans.get(i);
                list.add(h);
            }
        }
        return list;
    }
    @Override
    public HumanList searchHuman(String search) {

        return humans.searchHuman(search);
    }
    @Override
    public HumanList showHumans(){
        return humans;
    }

}



