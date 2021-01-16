package com.ithilel.menu;

import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

public class RemoveHumanByIndexMenuItem extends MenuItem {
    private HumanController humanController;
    public RemoveHumanByIndexMenuItem(HumanController humanController) {
        super("Remove Human by name");
        this.humanController=humanController;
    }

    @Override
    public void exec() {
        humanController.removeHumanByIndex();
    }
}

