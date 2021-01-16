package com.ithilel;

import com.ithilel.Services.HumanServices;
import com.ithilel.menu.*;
import com.ithilel.menu.base.Menu;
import com.ithilel.menu.base.MenuItem;
import com.ithilel.ui.HumanConsoleUI;
import com.ithilel.utils.HumanList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HumanConsoleUI humanUI = new HumanConsoleUI(sc);
        HumanServices humanServices = new HumanServices();
        HumanController controller = new HumanController(humanServices, humanUI);

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
