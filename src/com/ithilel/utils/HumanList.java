package com.ithilel.utils;
import com.ithilel.Human.entities.Human;
import java.util.Arrays;
import java.util.Objects;

public class HumanList {
    private Human[] humans = new Human[0];
    Human human;

    public void add(Human h) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = h;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanList humanList = (HumanList) o;
        return human.getSurname().equals(humanList.human.getSurname()) ||
                human.getName().equals(humanList.human.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(human);
    }

    @Override
    public String toString() {
        return "HumanList{" +
                "humans=" + Arrays.toString(humans) +
                ", human=" + human +
                '}';
    }
}





