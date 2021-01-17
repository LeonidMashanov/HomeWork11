package com.ithilel.Services;

import java.util.List;

public interface HumanServices {
    void removeHumanByIndex(int index);

    List searchHuman(String search);

    List showHumans();
}
