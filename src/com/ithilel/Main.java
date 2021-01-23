package com.ithilel;

import com.ithilel.Services.HumanConsoleServices;

import com.ithilel.menu.*;
import com.ithilel.menu.base.Menu;
import com.ithilel.menu.base.MenuItem;
import com.ithilel.ui.HumanConsoleUI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanConsoleUI humanUI = new HumanConsoleUI(sc);
        HumanConsoleServices humanServices = new HumanConsoleServices();
        HumanController humanController = new HumanController(humanServices, humanUI);

        Menu menu = new Menu(new MenuItem[]{
                new NewHumanMenuItem(humanController),
                new ShowHumanMenuItem(humanController),
                new RemoveHumanByIndexMenuItem(humanController),
                new SearchHumanBySurnameMenuItem(humanController),
                new SearchHumanByNameMenuItem(humanController),
                new ExitMenuItem()
        }, sc);
        menu.run();
    }
}
