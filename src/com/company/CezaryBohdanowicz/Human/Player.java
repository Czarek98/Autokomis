package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.*;

import java.util.HashSet;
import java.util.Set;

public class Player extends Human implements Saleable, Boughtable {

    public String firstname;
    public String lastname;
    public Set<Car> myCars;
    public Car car;
    public Double gameCash;
    public Double tax = 0.2;


    public Car getCar(Integer indexOfCar) {
        return car;
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
                ", car=" + car +
                ", gameCash=" + gameCash +
                ", tax=" + tax +
                '}';
    }

    public Player(String firstname, String lastname, Double gameCash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gameCash = gameCash;
        this.myCars = new HashSet<Car>();
    }

    public Double getGameCash() {
        return gameCash;
    }

    public void setGameCash(Double gameCash) {
        this.gameCash = gameCash;
    }

    public Double getPrice(Integer indexOfCar) {
        Car[] tempList = new Car[myCars.size()];
        myCars.toArray(tempList);
        return tempList[indexOfCar].getPrice();
    }

    public void addCar(Car car) {
        this.myCars.add(car);
        this.car = car;
    }

    public void removeCar(Car car) {
        this.myCars.remove(car);
    }

    public boolean hasCar(Car newCar) {
        return this.myCars.contains(newCar);
    }

    @Override
    public void Sell(Player player, Integer indexOfCar, ListOfClients client) throws Exception {
        if (!player.hasCar(this.getCar(indexOfCar)) &&
                client.getCash() < this.getCar(indexOfCar).price) {

            throw new Exception("Why " + client.firstname + " and " + player.firstname + " even meet ?");
        }

        if (!player.hasCar(this.getCar(indexOfCar))) {
            throw new Exception("There is no any car");
        }
        if (client.getCash() < this.getCar(indexOfCar).price) {
            throw new Exception("Not enough money !");
        }


        player.removeCar(this.getCar(indexOfCar));
        client.addCar(this.getCar(indexOfCar));
        player.setCash(player.getCash() + this.getCar(indexOfCar).price);
        client.setCash(client.getCash() - this.getCar(indexOfCar).price);
        System.out.println(player.firstname + " sold " + this.getCar(indexOfCar).brand + " to: " + client.firstname);
    }


    @Override
    public void Buy(Player player, Integer indexOfCar, ListOfCars listOfCars) throws Exception {
        if (player.gameCash < this.getCar(indexOfCar).price) {
            throw new Exception("Not enough money !");
        }

        listOfCars.removeCar(this.getCar(indexOfCar));
        myCars.add(this.getCar(indexOfCar));
        player.gameCash = player.gameCash - this.getCar(indexOfCar).price;
        player.gameCash = player.gameCash - (this.getCar(indexOfCar).price * tax);
    }
}

