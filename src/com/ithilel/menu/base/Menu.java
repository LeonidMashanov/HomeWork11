package com.ithilel.menu.base;

import com.ithilel.Exception.HumanAddException;

import com.ithilel.Exception.NotFoundException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private MenuItem[] item;
    private Scanner sc;

    public Menu(MenuItem[] item, Scanner sc) {
        this.item = item;
        this.sc = sc;
    }

    public void run() throws HumanAddException, NotFoundException {
        while (true) {
            showMenu();
            int choice = getUserChoice();
            if (isChoiceValid(choice)) {
                System.out.println("invalid choice,try again");
                continue;
            }
            item[choice].exec();
            if (item[choice].closeAfter()) break;
        }
    }

    private boolean isChoiceValid(int choice) {
        return choice < 0 || choice >= item.length;
    }

    private int getUserChoice() throws InputMismatchException {
        int choice = 0;
        System.out.println("Enter number of you choice");
        try {
            choice = sc.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("incorrect input of data");

        }
        sc.nextLine();
        return choice - 1;
    }

    private void showMenu() {
        for (int i = 0; i < item.length; i++) {
            System.out.println(i + 1 + " " + item[i].getName());
        }
    }
}

