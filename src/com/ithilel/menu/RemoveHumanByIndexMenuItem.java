package com.ithilel.menu;

import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

public class RemoveHumanByIndexMenuItem extends MenuItem {
    private HumanController humanController;
    public RemoveHumanByIndexMenuItem(HumanController humanController) {
        super("Remove Human by index");
        this.humanController=humanController;
    }

    @Override
    public void exec() throws  IndexOutOfBoundsException{
        try {
            humanController.removeHumanByIndex();
        }catch (IndexOutOfBoundsException e ){
            System.out.println("Wrong index, enter correct index");
        }

    }
}

