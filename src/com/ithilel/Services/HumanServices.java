package com.ithilel.Services;

import com.ithilel.Exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public interface HumanServices {
    void removeHumanByIndex(int index) throws NotFoundException;

    ArrayList searchHuman(String search) throws NotFoundException;

    List showHumans();
}
