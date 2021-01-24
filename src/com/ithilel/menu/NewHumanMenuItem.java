package com.ithilel.menu;

import com.ithilel.Exception.HumanAddException;
import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;


public class NewHumanMenuItem extends MenuItem {
    private HumanController controller;
    public NewHumanMenuItem(HumanController controller) {
        super("Create New Human");
        this.controller=controller;
    }

    @Override
    public void exec() throws HumanAddException {
        controller.readHuman();
    }
}