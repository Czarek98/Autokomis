package com.company.CezaryBohdanowicz;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListOfCars {
    public Set<Car> listOfCars;

    @Override
    public String toString() {
        return "\nListOfCars{" +
                "listOfCars=";
    }

    public ListOfCars() {

        this.listOfCars = new HashSet<Car>();
    }

    public void addCar() {
        this.listOfCars.add(new Car());
    }

    public void removeCar(Car car) {
        listOfCars.remove(car);
    }

    public Double getPrice(Integer indexOfCar) {
        Car[] tempList = new Car[listOfCars.size()];
        listOfCars.toArray(tempList);
        return tempList[indexOfCar].getPrice();
    }

    public Car getCar(Integer indexOfCar) {
        Car[] tempList = new Car[listOfCars.size()];
        listOfCars.toArray(tempList);
        return tempList[indexOfCar];
    }

    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }


}
