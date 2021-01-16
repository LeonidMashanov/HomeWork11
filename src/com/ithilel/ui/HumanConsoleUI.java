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
    public boolean suchAList(HumanList humanList, Human h) {
        boolean have = false;
        for (int i = 0; i < humanList.size(); i++) {
            if (humanList.get(i) == null) continue;
            else have = humanList.get(i).equals(h);
            if (have == true) break;
        }
        return have;
    }
    @Override
    public HumanList readHuman(HumanList humanList) {
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
    @Override
    public void showHumans(HumanList humanList) {
        Human h;
        int num = 1;
        for (int i = 0; i < humanList.size(); i++) {
            h = humanList.get(i);
            if (h != null)
                System.out.println((num++) + " - " + h.getSurname() + " , " + h.getName() + " , " + h.getPatronymic());
        }
    }
    @Override
    public int indexToRemoteHuman() {
        System.out.println("enter index to remote Human from list");
        int indexToRemote = sc.nextInt();
        sc.nextLine();
        return indexToRemote;
    }
    @Override
    public String nameToSearch() {
        System.out.println("enter name to search");
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
