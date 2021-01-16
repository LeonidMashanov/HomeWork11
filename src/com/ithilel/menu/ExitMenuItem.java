package com.ithilel.menu;

import com.ithilel.menu.base.MenuItem;

public class ExitMenuItem extends MenuItem {

    public ExitMenuItem() {
        super("Exit",true);
    }

    @Override
    public void exec() {
        System.out.println("Good By");
    }
}