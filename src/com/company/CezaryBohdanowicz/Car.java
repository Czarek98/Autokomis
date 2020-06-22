package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Human;

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
    public Parts brokenpart;
    public Integer indexOfCar;
    public ArrayList<Human> owners = new ArrayList<>();
    Double randomMileage = ThreadLocalRandom.current().nextDouble(1.0, 400000.0 + 1);
    Double randomBudget = ThreadLocalRandom.current().nextDouble(5000.0, 50000.0 + 1);
    Double randomStandard = ThreadLocalRandom.current().nextDouble(51000.0, 120000.0 + 1);
    Double randomPremium = ThreadLocalRandom.current().nextDouble(121000.0, 1000000.0 + 1);

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getMileage() {
        return mileage;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public Parts getBrokenpart() {
        return brokenpart;
    }

    public void setBrokenpart() {
        this.brokenpart = brokenpart;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", color='" + color + '\'' +
                ", segment='" + segment + '\'' +
                ", price=" + price +
                ", brokenpart=" + brokenpart +
                '}';
    }

    public Car() {

        this.brand = carGenerator();
        this.mileage = randomMileage;
        this.segment = setSegment();
        this.color = colorGenerator();
        this.price = setValue();
        this.brokenpart = new Parts();

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
