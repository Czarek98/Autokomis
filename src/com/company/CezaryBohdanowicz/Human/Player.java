package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.Car;
import com.company.CezaryBohdanowicz.Saleable;

import java.util.Set;

public class Player extends Human implements Saleable {

    public String firstname;
    public String lastname;
    public Set<Car> myCars;
    public Car car;

    @Override
    public void Sell(Human player, Human client, Double price) throws Exception {

    }
}
