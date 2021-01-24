package com.ithilel.menu;

import com.ithilel.Exception.NotFoundException;
import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

public class RemoveHumanByIndexMenuItem extends MenuItem {
    private HumanController humanController;

    public RemoveHumanByIndexMenuItem(HumanController humanController) {
        super("Remove Human by index");
        this.humanController = humanController;
    }

    @Override
    public void exec() {
        try {
            humanController.removeHumanByIndex();
        } catch (NotFoundException e) {
            System.out.println("Human not found");
        }
    }
}

