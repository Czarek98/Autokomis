package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.*;
import com.company.CezaryBohdanowicz.Mechanic;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player extends Human implements Saleable, Boughtable, Mechanic {

    public String firstname;
    public String lastname;
    public MyCars myCars;
    public Car car;
    public Client client;
    public Double gameCash;
    public Double tax = 0.02;


    public Player(String firstname, String lastname, Double gameCash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gameCash = gameCash;
        this.myCars = new MyCars();
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", myCars=" + myCars +
                ", gameCash=" + gameCash +
                '}';
    }

    public Double getGameCash() {
        return gameCash;
    }

    public void setGameCash(Double gameCash) {
        this.gameCash = gameCash;
    }

    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }

    @Override
    public void Sell(Integer indexOfCar, Integer indexOfClient, ListOfClients listOfClients, ListOfCars listOfCars, MyCars myCars) throws Exception {
        if (!myCars.hasCar(myCars.getCar(indexOfCar))) {
            throw new Exception("There is no any car");
        }
        if (listOfClients.getClient(indexOfClient).getCash() < myCars.getCar(indexOfCar).price) {
            throw new Exception("Not enough money !");
        }
        this.setCash(this.gameCash + myCars.getCar(indexOfCar).price);
        System.out.println(this.firstname + " sold " + myCars.getCar(indexOfCar).brand + " to: " + listOfClients.getClient(indexOfClient).firstname);
        myCars.removeCar(myCars.getCar(indexOfCar));
    }

    @Override
    public void Buy(Integer indexOfCar, ListOfCars cars, MyCars myCars) throws Exception {
        if (this.getGameCash() < cars.getPrice(indexOfCar)) {
            throw new Exception("Not enough money !");
        }

        this.setGameCash(this.getGameCash() - cars.getCar(indexOfCar).price);
        this.gameCash = this.gameCash - (cars.getCar(indexOfCar).price * tax);
        System.out.println("You bought " + cars.getCar(indexOfCar).brand + " for " + cars.getCar(indexOfCar).price);
        System.out.println("Now you have: " + this.gameCash);
        cars.listOfCars.remove(indexOfCar);
        cars.listOfCars.put(indexOfCar, new Car());
    }

    @Override
    public void Repair(Integer indexOfPart, Integer indexOfCar) {

    }
}

