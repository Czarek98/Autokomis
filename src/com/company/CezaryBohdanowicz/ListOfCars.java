package com.company.CezaryBohdanowicz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListOfCars {
    public Set<Car> listOfCars;

    @Override
    public String toString() {
        return "ListOfCars{" +
                "listOfCars=" + listOfCars +
                '}';
    }

    public ListOfCars() {

        this.listOfCars = new HashSet<Car>();
    }

    public void addCar() {
        this.listOfCars.add(new Car());
    }

    public void removeCar(Car car){
        this.listOfCars.remove(car);
    }

}
