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
        HumanConsoleServices humanConsoleServices = new HumanConsoleServices();
        HumanController controller = new HumanController(humanConsoleServices, humanUI);

        Menu menu = new Menu(new MenuItem[]{
                new NewHumanMenuItem(controller),
                new ShowHumanMenuItem(controller),
                new RemoveHumanByIndexMenuItem(controller),
                new SearchHumanBySurnameMenuItem(controller),
                new SearchHumanByNameMenuItem(controller),
                new ExitMenuItem()
        },sc);
        menu.run();

    }

}
