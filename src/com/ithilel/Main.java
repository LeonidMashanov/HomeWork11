package com.ithilel;

import com.ithilel.Services.HumanServices;
import com.ithilel.ui.HumanUI;
import com.ithilel.utils.HumanList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanUI humanUI = new HumanUI(sc);
        HumanServices humanServices = new HumanServices();
        HumanController controller = new HumanController(humanServices, humanUI);
        HumanList humanList = new HumanList();
        while (true) {
            System.out.println("------MENU-------");
            System.out.println("new human - 1");
            System.out.println("print list - 2");
            System.out.println("remove by name - 3");
            System.out.println("search by surname - 4");
            System.out.println("search by name - 5");
            System.out.println("exit - 6");
            int enter = sc.nextInt();
            sc.nextLine();
            if (enter == 1) humanUI.readHuman(humanList, sc);
            else if (enter == 2) humanUI.showHumans(humanList);
            else if (enter == 3) controller.removeHumanByIndex(humanList);
            else if (enter == 4) controller.searchBySurname(humanList, humanUI.nameToSearch(sc));
            else if (enter == 5) controller.searchByName(humanList, humanUI.nameToSearch(sc));
            else if (enter == 6) break;
            else {
                System.out.println("your command invalid");
                continue;
            }
        }
    }

}
