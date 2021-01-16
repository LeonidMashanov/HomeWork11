package com.ithilel.utils;

import com.ithilel.entities.Human;

import java.util.Arrays;

public class HumanList {
    private Human[] humans = new Human[0];

    public void add(Human h) {
//        if (suchAList(h)){return;}
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
    }

    public boolean suchAList(Human human) {

        for (Human elem : humans) {
            if(elem.equals(human))
                return true;
        }
                
        return false;
    }

    public Human get(int index) {
        return humans[index];
    }

    public void set(int index, Human value) {
        humans[index] = value;
    }

    public int size() {
        return humans.length;
    }

    public void setToRemote(int index, HumanList humanList, Human human) {
        humanList.set(index, human);
    }

    public HumanList searchHuman(String search) {
        HumanList temp = new HumanList();
        for (Human elem : humans) {
            if (search.equals(elem.getName()) || search.equals(elem.getSurname())) {
                temp.add(elem);
            }
        }
        return temp;
    }

}





