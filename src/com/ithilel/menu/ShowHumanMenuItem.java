package com.ithilel.menu;

import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

import java.util.Scanner;

public class ShowHumanMenuItem extends MenuItem {
    private HumanController controller;
    public ShowHumanMenuItem(HumanController controller) {
        super("Show Human");
        this.controller= controller;
    }

    @Override
    public void exec() {
        controller.showHumans();
    }
}
