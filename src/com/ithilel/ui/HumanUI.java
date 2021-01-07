package com.ithilel.ui;

import com.ithilel.entities.Human;

import com.ithilel.utils.HumanList;

import java.util.Scanner;

public class HumanUI {
    Scanner sc;
    Human human;

    public HumanUI(Scanner sc) {
        this.sc = sc;
    }

    public boolean suchAList(HumanList humanList, Human h) {
        boolean have = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i) == null) continue;
            else have = humanList.get(i).equals(h);
            if (have == true) break;
        }
        return have;
    }

    public HumanList readHuman(HumanList humanList, Scanner sc) {
        System.out.println("enter new human");
        System.out.println("enter surname");
        String surname = sc.nextLine();
        System.out.println("enter name ");
        String name = sc.nextLine();
        System.out.println("enter patronymic");
        String patronymic = sc.nextLine();
        Human h = new Human(surname, name, patronymic);
        if (suchAList(humanList, h) == true) System.out.println("such human is on the list");
        else humanList.add(h);
        return humanList;
    }

    public void showHumans(HumanList humanList) {
        Human h;
        int num = 1;
        for (int i = 0; i < humanList.size(); i++) {
            h = humanList.get(i);
            if (h != null)
                System.out.println((i) + " - " + h.getSurname() + " , " + h.getName() + " , " + h.getPatronymic());
        }
    }

    public int indexToRemoteHuman() {
        System.out.println("enter index to remote Human from list");
        int indexToRemote = sc.nextInt();
        return indexToRemote;
    }

    public String nameToSearch(Scanner sc) {
        System.out.println("enter name to search");
        String name = sc.nextLine();
        return name;
    }

    public void showHumanOfSearch(HumanList list, int index) {
        if (index < list.size()) System.out.println("found Human - " + list.get(index));
        else System.out.println("not found");
    }

    @Override
    public String toString() {
        return "HumanUI{" +
                "human-" + human +
                '}';
    }

}
