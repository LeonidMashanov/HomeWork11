package com.ithilel.ui;

import com.ithilel.entities.Human;

import java.util.List;
import java.util.Scanner;

public class HumanConsoleUI implements HumanUI {
    Scanner sc;

    public HumanConsoleUI(Scanner sc) {
        this.sc = sc;
    }


    @Override
    public List readHuman(List list) {
        System.out.println("enter new Human");
        System.out.println("enter Surname");
        String surname = sc.nextLine();
        System.out.println("enter Name ");
        String name = sc.nextLine();
        System.out.println("enter Patronymic");
        String patronymic = sc.nextLine();
        Human human = new Human(surname, name, patronymic);
        if (list.contains(human)) System.out.println("Such Human is on the list");
        else list.add(human);
        return list;
    }

    @Override
    public void showHumans(List list) {
        Human human;
        int num = 1;
        for (int i = 0; i < list.size(); i++) {
            human = (Human) list.get(i);
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
    public void showHumanOfSearch(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
