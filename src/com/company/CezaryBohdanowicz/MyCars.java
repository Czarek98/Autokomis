package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Player;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyCars {

    public Map<Integer, Car> myCars;

    public MyCars() {

        this.myCars = new HashMap<>();
    }

    @Override
    public String toString() {
        return "\nmyCars{" +
                "myCars=";
    }

    public void addCar(Integer indexOfCar, Car car) {
        myCars.put(indexOfCar, car);
    }

    public void removeCar(Car indexOfCar) {
        myCars.remove(indexOfCar);
    }

    public boolean hasCar(Car indexOfCar) {
        return myCars.containsKey(myCars.get(indexOfCar));
    }

    public Double getPrice(Integer indexOfCar) {
        return myCars.get(indexOfCar).price;
    }

    public Car getCar(Integer indexOfCar) {
        return myCars.get(indexOfCar);
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
