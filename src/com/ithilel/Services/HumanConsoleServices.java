package com.ithilel.Services;

import com.ithilel.Exception.NotFoundException;
import com.ithilel.entities.Human;

import java.util.ArrayList;

import java.util.LinkedList;
import java.util.List;

public class HumanConsoleServices implements HumanServices {
    List<Human> humans = new LinkedList<>();

    @Override
    public void removeHumanByIndex(int index) throws NotFoundException {
        if (index < 0 || index >= humans.size()) throw new NotFoundException();
        else humans.remove(index);
    }

    @Override
    public List showHumans() {
        return humans;
    }

    @Override
    public ArrayList searchHuman(String search) throws NotFoundException {
        ArrayList temp = new ArrayList();
        for (Human elem : humans) {
            if (elem.getSurname().contains(search) || elem.getName().contains(search)) {
                temp.add(elem);
            }
        }
        if (temp.size() == 0)throw new NotFoundException();

        return temp;
    }
}



