package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Player;

public interface Boughtable {
    void Buy(Player player, Integer indexOfCar, ListOfCars cars) throws Exception;
}
