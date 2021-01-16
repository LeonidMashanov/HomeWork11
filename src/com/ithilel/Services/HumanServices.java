package com.ithilel.Services;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

public class HumanServices {
    private HumanList humans = new HumanList();

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

    public HumanList searchHuman(String search) {

        return humans.searchHuman(search);
    }
    public HumanList showHumans(){
        return humans;
    }
    @Override
    public String toString() {
        return "HumanServices{" +
                "humans=" + humans +
                '}';
    }
}



