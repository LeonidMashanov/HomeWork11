package com.ithilel.Services;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

public class HumanServices {
    private HumanList humans = new HumanList();

    public HumanList removeHumanByIndex(HumanList humanList, int index) {
        HumanList list = new HumanList();
        int newIndex = 0;
        humanList.setToRemote(index - 1, humanList, null);
        for (int i = 0; i < humanList.size() - 1; i++) {
            if (humanList.get(i) != null) {
                Human h = humanList.get(i);
                list.add(h);
            }
        }
        return list;
    }

    public int searchBySurname(HumanList humanList, String search) {
        Human h = new Human(search, search, search);
        int index = 0;
        boolean have = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getSurname() == null) continue;
            else have = humanList.get(i).getSurname().equals(h.getSurname());

            if (have == true) break;
            index++;
        }
        return index;
    }

    public int searchByName(HumanList humanList, String search) {
        Human h = new Human(search, search, search);
        int index = 0;
        boolean have = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i).getName() == null) continue;
            else have = humanList.get(i).getName().equals(h.getName());

            if (have == true) break;
            index++;
        }
        return index;
    }

    @Override
    public String toString() {
        return "HumanServices{" +
                "humans=" + humans +
                '}';
    }
}



