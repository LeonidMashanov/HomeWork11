package com.ithilel.menu;

import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;
import com.ithilel.ui.HumanConsoleUI;

public class SearchHumanBySurnameMenuItem extends MenuItem {
    private HumanController humanController;
    private HumanConsoleUI ui;
    public SearchHumanBySurnameMenuItem(HumanController controller) {
        super("Search Human by surname");
        this.humanController=controller;
    }

    @Override
    public void exec() {
        humanController.searchBySurname();
    }
}