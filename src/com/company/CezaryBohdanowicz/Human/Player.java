package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.*;

import java.text.DecimalFormat;
import java.util.HashMap;

public class Player extends Human implements Saleable, Boughtable, Repairable {

    public String firstname;
    public String lastname;
    public HashMap<Integer, Car> myCars;
    public Car car;
    public Double gameCash;
    public Double tax = 0.02;


    public Player(String firstname, String lastname, Double gameCash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gameCash = gameCash;
        this.myCars = new HashMap<Integer, Car>();
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
    public void Sell(Integer indexOfCar, Integer indexOfClient, ListOfClients listOfClients, MyCars myCars) {

        this.setGameCash(this.getGameCash() + this.myCars.get(indexOfCar).price);
        this.gameCash = this.gameCash + (this.myCars.get(indexOfCar).price * tax);
        System.out.println(this.firstname + " sold " + this.myCars.get(indexOfCar).brand +
                " to: " + listOfClients.listOfClients.get(indexOfClient).firstname + " for " +
                roundTheNumber(this.myCars.get(indexOfCar).price));
        this.myCars.remove(indexOfCar);
        listOfClients.listOfClients.remove(indexOfClient);
        System.out.println("Now you have: " + roundTheNumber(this.gameCash));
    }

    @Override
    public void Buy(Integer indexOfCar, ListOfCars cars, MyCars myCars) throws Exception {
        if (this.getGameCash() < cars.getPrice(indexOfCar)) {
            throw new Exception("Not enough money !");
        }

        this.setGameCash(this.getGameCash() - cars.getCar(indexOfCar).price);
        this.gameCash = this.gameCash - (cars.getCar(indexOfCar).price * tax);
        System.out.println("You bought " + cars.getCar(indexOfCar).brand +
                " for " + roundTheNumber(cars.getCar(indexOfCar).price));
        System.out.println("Now you have: " + roundTheNumber(this.gameCash));
        myCars.myCars.put(indexOfCar, cars.getCar(indexOfCar));
        this.myCars.put(this.myCars.size() + 1, cars.getCar(indexOfCar));
        cars.removeCar(indexOfCar);
        cars.addCar(indexOfCar);
    }

    @Override
    public void Repair(Integer indexOfCar) {
        if (this.myCars.get(indexOfCar).part.brakes = false) {
            this.myCars.get(indexOfCar).part.brakes = true;
            this.myCars.get(indexOfCar).setPrice(this.myCars.get(indexOfCar).price + this.myCars.get(indexOfCar).price * 0.1);
            System.out.println(this.myCars.get(indexOfCar).price);
        }

        if (this.myCars.get(indexOfCar).part.suspension = false) {
            this.myCars.get(indexOfCar).part.suspension = true;
            this.myCars.get(indexOfCar).setPrice(this.myCars.get(indexOfCar).price + this.myCars.get(indexOfCar).price * 0.1);
            System.out.println(this.myCars.get(indexOfCar).price);

        }
        if (this.myCars.get(indexOfCar).part.engine = false) {
            this.myCars.get(indexOfCar).part.engine = true;
            this.myCars.get(indexOfCar).setPrice(this.myCars.get(indexOfCar).price + this.myCars.get(indexOfCar).price * 0.1);
            System.out.println(this.myCars.get(indexOfCar).price);

        }
        if (this.myCars.get(indexOfCar).part.body = false) {
            this.myCars.get(indexOfCar).part.body = true;
            this.myCars.get(indexOfCar).setPrice(this.myCars.get(indexOfCar).price + this.myCars.get(indexOfCar).price * 0.1);
            System.out.println(this.myCars.get(indexOfCar).price);

        }
        if (this.myCars.get(indexOfCar).part.gearbox = false) {
            this.myCars.get(indexOfCar).part.gearbox = true;
            this.myCars.get(indexOfCar).setPrice(this.myCars.get(indexOfCar).price + this.myCars.get(indexOfCar).price * 0.5);
            System.out.println(this.myCars.get(indexOfCar).price);
        }


    }
}

