package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.Car;
import com.company.CezaryBohdanowicz.Saleable;

import java.util.Set;

public class Player extends Human implements Saleable {

    public String firstname;
    public String lastname;

    public Player(String firstname, String lastname, Double gameCash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gameCash = gameCash;
    }

    public Set<Car> myCars;
    public Car car;
    public Double gameCash;

    @Override
    public void Sell(Human player, Human client, Double price) throws Exception {

    }
}
