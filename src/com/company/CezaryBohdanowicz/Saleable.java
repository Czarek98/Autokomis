package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Client;
import com.company.CezaryBohdanowicz.Human.Human;
import com.company.CezaryBohdanowicz.Human.Player;

public interface Saleable {
    void Sell(Integer indexOfCar, Integer indexOfClient, ListOfClients listOfClients, ListOfCars listOfCars, MyCars myCars) throws Exception;
}
