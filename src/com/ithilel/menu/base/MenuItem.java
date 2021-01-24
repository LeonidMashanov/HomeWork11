package com.ithilel.menu.base;

import com.ithilel.Exception.HumanAddException;
import com.ithilel.Exception.NotFoundException;

public abstract class MenuItem {
    private String name;
    private boolean closeAfter;

    public MenuItem(String name) {
        this.name = name;
        this.closeAfter = false;
    }

    public MenuItem(String name, boolean closeAfter) {
        this.name = name;
        this.closeAfter = closeAfter;
    }

    public String getName() {
        return name;
    }

    public abstract void exec() throws HumanAddException, NotFoundException;

    public boolean closeAfter() {
        return closeAfter;
    }
}