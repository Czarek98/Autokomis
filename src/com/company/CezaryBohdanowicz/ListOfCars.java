package com.company.CezaryBohdanowicz;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ListOfCars {
    public Map<Integer, Car> listOfCars;
    Integer indexOfCar;

    public ListOfCars() {

        this.listOfCars = new HashMap<>();
    }

    @Override
    public String toString() {
        return "\nListOfCars=";
    }

    public void addCar() {
        listOfCars.put(indexOfCar, new Car());
    }

    public void removeCar(Car indexOfCar) {
        listOfCars.remove(indexOfCar);
    }

    public Double getPrice(Integer indexOfCar) {
        return listOfCars.get(indexOfCar).price;
    }

    public Car getCar(Integer indexOfCar) {
        return listOfCars.get(indexOfCar);
    }

    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }

    public Parts getPart(Integer indexOfPart) {
        Parts[] part = new Parts[6];
        return part[indexOfPart];
    }


}
