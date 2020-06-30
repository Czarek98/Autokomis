package com.company.CezaryBohdanowicz;

import java.util.HashMap;
import java.util.Map;

public class ListOfCars {
    public Map<Integer, Car> listOfCars;

    public ListOfCars() {

        this.listOfCars = new HashMap<>();
    }

    @Override
    public String toString() {
        return "\nListOfCars=";
    }

    public void addCar(Integer indexOfCar) {
        listOfCars.put(indexOfCar, new Car());
    }

    public void removeCar(Integer indexOfCar) {
        listOfCars.remove(indexOfCar);
    }

    public Double getPrice(Integer indexOfCar) {
        return listOfCars.get(indexOfCar).price;
    }

    public Car getCar(Integer indexOfCar) {
        return listOfCars.get(indexOfCar);
    }


}
