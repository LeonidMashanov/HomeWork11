package com.ithilel.Services;

import java.util.ArrayList;
import java.util.List;

public interface HumanServices {
    void removeHumanByIndex(int index);

    ArrayList searchHuman(String search);

    List showHumans();
}
