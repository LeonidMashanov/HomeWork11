package com.ithilel.Services;

import com.ithilel.entities.Human;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class HumanConsoleServices implements HumanServices {
    List<Human> humans = new LinkedList<>();

    @Override
    public void removeHumanByIndex(int index) {
        if (index < 0 || index >= humans.size()) System.out.println("human not found");
        humans.remove(index - 1);
    }

    @Override
    public List showHumans() {
        return humans;
    }

    @Override
    public ArrayList searchHuman(String search) {
        ArrayList temp = new ArrayList();
        for (Human elem : humans) {
            if (elem.getSurname().contains(search) || elem.getName().contains(search)) {
                temp.add(elem);
            }
        }
        if (temp.size() == 0) System.out.println("not found of you search");

        return temp;
    }
}



