package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Human;
import org.w3c.dom.ls.LSOutput;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Math;


public class Car {

    public String brand;
    public Double mileage;
    public String color;
    public String segment;
    public String premium = "Premium";
    public String standard = "Standard";
    public String budget = "Budget";
    public Double price;
    public Parts part;
    Double randomMileage = ThreadLocalRandom.current().nextDouble(1.0, 400000.0 + 1);
    Double randomBudget = ThreadLocalRandom.current().nextDouble(5000.0, 50000.0 + 1);
    Double randomStandard = ThreadLocalRandom.current().nextDouble(51000.0, 120000.0 + 1);
    Double randomPremium = ThreadLocalRandom.current().nextDouble(121000.0, 1000000.0 + 1);


    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSegment() {
        return segment;
    }

    public Car() {

        this.brand = carGenerator();
        this.mileage = randomMileage;
        this.segment = setSegment();
        this.color = colorGenerator();
        this.price = setValue();
        this.part = new Parts();

    }


    public String roundTheNumber(Double notRound) {
        DecimalFormat df = new DecimalFormat(".00");
        return df.format(notRound);
    }

    @Override
    public String toString() {
        return "brand: " + this.brand + '\'' +
                ", mileage: " + this.roundTheNumber(mileage) + "km" + '\'' +
                ", color: " + this.color + '\'' +
                ", segment: '" + this.segment + '\'' +
                ", price: " + this.roundTheNumber(price) + "zł" + '\'' +
                ", " + part;
    }


    public String carGenerator() {
        Random random = new Random();
        String[] brands = {"Mercedes", "Audi", "BMW", "Alfa Romeo", "Fiat", "Volkswagen", "Ford", "Lamborghini", "Ferrari", "Porsche", "Aston Martin", "Opel", "Skoda"};

        return brand = brands[random.nextInt(brands.length)];

    }

    public String colorGenerator() {
        Random random = new Random();
        String[] colors = {"black", "white", "red", "blue", "yellow", "green", "grey"};

        return color = colors[random.nextInt(colors.length)];

    }

    public String setSegment() {
        if (this.brand.equals("Fiat") || this.brand.equals("Skoda") || this.brand.equals("Opel") || this.brand.equals("Ford") || this.brand.equals("Volkswagen")) {
            return budget;
        }
        if (this.brand.equals("Mercedes") || this.brand.equals("BMW") || this.brand.equals("Audi") || this.brand.equals("Alfa romeo")) {
            return standard;
        } else {
            return premium;
        }

    }

    public Double setValue() {
        if (this.segment == "Premium")
            return randomPremium;
        if (this.segment == "Standard")
            return randomStandard;
        else
            return randomBudget;

    }


}
