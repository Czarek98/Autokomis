package com.company.CezaryBohdanowicz;

import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;

public class MyCars {

    public Set<Car> myCars;

    public MyCars() {

        this.myCars = new HashSet<Car>();
    }

    @Override
    public String toString() {
        return "\nmyCars{" +
                "myCars=";
    }

    public void addCar(Car car) {
        myCars.add(new Car());
    }

    public void removeCar(Car car) {
        myCars.remove(car);
    }

    public boolean hasCar(Car newCar) {
        return myCars.contains(newCar);
    }

    public Double getPrice(Integer indexOfCar) {
        Car[] tempList = new Car[myCars.size()];
        myCars.toArray(tempList);
        return tempList[indexOfCar].getPrice();
    }

    public Car getCar(Integer indexOfCar) {
        Car[] tempList = new Car[myCars.size()];
        myCars.toArray(tempList);
        return tempList[indexOfCar];
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
