package com.ithilel.menu;

import com.ithilel.HumanController;
import com.ithilel.menu.base.MenuItem;

public class SearchHumanByNameMenuItem extends MenuItem {
    private HumanController humanController;
    public SearchHumanByNameMenuItem(HumanController controller) {
        super("Search Human by surname");
    }

    @Override
    public void exec() {
        humanController.searchByName();
    }
}