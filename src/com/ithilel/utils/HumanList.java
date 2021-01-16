package com.ithilel.utils;

import com.ithilel.entities.Human;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HumanList {

    List<Human> humans = new LinkedList<>();

    public void add(Human h) {
        humans.add(h);
    }

    public boolean suchAList(Human human) {
        if (humans.contains(human)) return true;
        else return false;
    }

    public Human get(int index) {
        return humans.get(index);
    }

    public void set(int index, Human value) {
        humans.set(index, value);
    }

    public int size() {
        return humans.size();
    }

    public void removeByIndex(int index) {

        humans.remove(index);
    }

    public HumanList searchHuman(String search) {
        HumanList temp = new HumanList();
        for (Human elem : humans) {
            if (elem.getSurname().contains(search)||elem.getName().contains(search)){
                temp.add(elem);
            }
        }
        return temp;
    }

}





