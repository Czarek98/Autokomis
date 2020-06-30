package com.company.CezaryBohdanowicz.Human;

import com.company.CezaryBohdanowicz.Car;

import java.util.HashSet;
import java.util.Set;

public class Human {
    private Double cash;

    public String firstname;
    public String lastname;

    @Override
    public String toString() {
        return "\nHuman{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", cars=" + cars +
                '}';
    }

    public Set<Car> cars;
    public Human(){
        this.cars = new HashSet<Car>();
    }
}
