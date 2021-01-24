package com.ithilel.menu;

import com.ithilel.Exception.NotFoundException;
import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

public class SearchHumanByNameMenuItem extends MenuItem {
    private HumanController humanController;

    public SearchHumanByNameMenuItem(HumanController controller) {
        super("Search Human by surname");
        this.humanController = controller;
    }

    @Override
    public void exec() {
       try {
           humanController.searchByName();
       }catch (NotFoundException e){
           System.out.println("Human with given parameters was not found");
       }

    }
}