package com.ithilel.Services;

import com.ithilel.utils.HumanList;

public interface HumanServices {
    void removeHumanByIndex(int index);

    HumanList searchHuman(String search);

    HumanList showHumans();
}
