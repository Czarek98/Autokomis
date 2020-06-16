package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.Car;

import java.util.HashSet;
import java.util.Set;

public class Human {
    public String firstname;
    public String lastname;
    private  Double cash;
    public Set<Car> cars;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getCash() {
        return this.cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

    public Human(){
        this.cars = new HashSet<Car>();
    }
}
