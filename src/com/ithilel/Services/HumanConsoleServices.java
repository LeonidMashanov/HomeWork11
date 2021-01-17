package com.ithilel.Services;

import com.ithilel.entities.Human;

import java.util.ArrayList;

import java.util.List;

public class HumanConsoleServices implements HumanServices {
    List<Human> humans;

    public HumanConsoleServices(List<Human> humans) {
        this.humans = humans;
    }

    @Override
    public void removeHumanByIndex(int index) {
        humans.remove(index - 1);
    }

    @Override
    public List showHumans() {
        return humans;
    }
    @Override
    public List searchHuman(String search) {
        ArrayList temp = new ArrayList();
        for (Human elem : humans) {
            if (elem.getSurname().contains(search)||elem.getName().contains(search)){
                temp.add(elem);
            }
        }
        return temp;
    }
}



