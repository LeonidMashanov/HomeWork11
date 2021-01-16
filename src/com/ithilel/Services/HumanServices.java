package com.ithilel.Services;

import com.ithilel.entities.Human;
import com.ithilel.utils.HumanList;

public interface HumanServices {
    HumanList removeHumanByIndex(int index) ;
    HumanList searchHuman(String search);
    HumanList showHumans();
}
