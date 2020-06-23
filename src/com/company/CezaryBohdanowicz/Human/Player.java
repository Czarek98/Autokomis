package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.*;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player extends Human implements Saleable, Boughtable {

    public String firstname;
    public String lastname;
    public Set<Car> myCars;
    public Set<Client> myClients;
    public Car car;
    public Client client;
    public Double gameCash;
    public Double tax = 0.02;


    public Player(String firstname, String lastname, Double gameCash) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gameCash = gameCash;
        this.myCars = new HashSet<Car>();
        this.myClients = new HashSet<Client>();
    }

    public Car getCar(Integer indexOfCar) {
        Car[] myArray = new Car[myCars.size()];
        myCars.toArray(myArray);
        return myArray[indexOfCar];
    }


    public void setCar(Car car) {
        this.car = car;
    }

    public Client getClient(Integer indexOfClient) {
        Client[] myArray = new Client[myClients.size() + 10];
        myClients.toArray(myArray);
        return myArray[indexOfClient];
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", myCars=" + myCars +
                ", myClients=" + myClients +
                ", gameCash=" + gameCash +
                '}';
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

    public void addClient(Client client) {
        this.myClients.add(client);
        this.client = client;
    }

    public void removeCar(Car car) {
        this.myCars.remove(car);
    }

    public void removeClient(Client client) {
        this.myClients.remove(client);
    }

    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }

    public boolean hasCar(Car newCar) {
        return this.myCars.contains(newCar);
    }

    @Override
    public void Sell(Integer indexOfCar, Integer indexOfClient, ListOfClients listOfClients, ListOfCars listOfCars) throws Exception {
        if (!this.hasCar(this.getCar(indexOfCar))) {
            throw new Exception("There is no any car");
        }
        if (listOfClients.getClient(indexOfClient).getCash() < this.getCar(indexOfCar).price) {
            throw new Exception("Not enough money !");
        }
        this.removeCar(this.getCar(indexOfCar));
        this.setCash(this.gameCash + this.getCar(indexOfCar).price);
        System.out.println(this.firstname + " sold " + this.getCar(indexOfCar).brand + " to: " + this.getClient(indexOfClient).firstname);
    }


    @Override
    public void Buy(Integer indexOfCar, ListOfCars cars) throws Exception {
        if (this.getGameCash() < cars.getPrice(indexOfCar)) {
            throw new Exception("Not enough money !");
        }

        this.myCars.add(cars.getCar(indexOfCar));
        this.setGameCash(this.getGameCash() - cars.getCar(indexOfCar).price);
        this.gameCash = this.gameCash - (cars.getCar(indexOfCar).price * tax);
        cars.listOfCars.remove(cars.getCar(indexOfCar));
        cars.listOfCars.add(new Car());
        System.out.println("You bought " + cars.getCar(indexOfCar).brand + " for " + cars.getCar(indexOfCar).price);
        System.out.println("Now you have: " + this.gameCash);
    }
}

