package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;
import com.company.CezaryBohdanowicz.Human.Player;

public interface Saleable {
    void Sell(Player player,Integer indexOfCar, ListOfClients client) throws Exception;
}
