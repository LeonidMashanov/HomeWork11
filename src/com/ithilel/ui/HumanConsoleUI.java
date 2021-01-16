package com.ithilel.ui;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {
    Scanner sc;

    public HumanConsoleUI(Scanner sc) {
        this.sc = sc;
    }


    @Override
    public HumanList readHuman(HumanList humanList) {
        System.out.println("enter new Human");
        System.out.println("enter Surname");
        String surname = sc.nextLine();
        System.out.println("enter Name ");
        String name = sc.nextLine();
        System.out.println("enter Patronymic");
        String patronymic = sc.nextLine();
        Human human = new Human(surname, name, patronymic);
        if (humanList.suchAList(human)) System.out.println("Such Human is on the list");
        else humanList.add(human);
        return humanList;
    }

    @Override
    public void showHumans(HumanList humanList) {
        Human human;
        int num = 1;
        for (int i = 0; i < humanList.size(); i++) {
            human = humanList.get(i);
            if (human != null)
                System.out.println((num++) + " - " + human.getSurname() + " , " + human.getName() + " , " + human.getPatronymic());
        }
    }

    @Override
    public int indexToRemoteHuman() {
        System.out.println("Enter index to remote Human from list");
        int indexToRemote = sc.nextInt();
        sc.nextLine();
        return indexToRemote;
    }

    @Override
    public String nameToSearch() {
        System.out.println("Enter Name to search");
        String name = sc.nextLine();
        return name;
    }

    @Override
    public String surnameToSearch() {
        System.out.println("enter Surname to search");
        String name = sc.nextLine();
        return name;
    }

    @Override
    public void showHumanOfSearch(HumanList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
