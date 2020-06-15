package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Human;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Car implements Sell{

    public String brand;
    public final Integer mileage;
    public String color;
    public final Double price;
    static String PREMIUM = "premium";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getMileage() {
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

    public String getBrokenpart() {
        return brokenpart;
    }

    public void setBrokenpart(String brokenpart) {
        this.brokenpart = brokenpart;
    }

    static String STANDARD = "standard";
    static String BUDGET = "budget";
    public ArrayList<Human> owners = new ArrayList<Human>();
    Double randomMileage = ThreadLocalRandom.current().nextDouble(1.0, 400000.0 + 1);
    public String brokenpart;

    public Car(String brand, Integer mileage, String color, Double price, String brokenpart) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.price = price;
        this.brokenpart = brokenpart;

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


    public String[] parts = {"brakes", "suspension", "engine", "body", "shifting gear"};

    public String brokenParts() {
        Random random = new Random();

        return brokenpart = parts[random.nextInt(parts.length)];
    }

    public String setSegment() {
        if (this.brand.equals("Fiat") || this.brand.equals("Skoda") || this.brand.equals("Opel") || this.brand.equals("Ford") || this.brand.equals("Volkswagen")) {
            return BUDGET;
        }
        if (this.brand.equals("Mercedes") || this.brand.equals("BMW") || this.brand.equals("Audi") || this.brand.equals("Alfa romeo")) {
            return STANDARD;
        } else {
            return PREMIUM;
        }

    }

    Double randomBudget = ThreadLocalRandom.current().nextDouble(5000.0, 50000.0 + 1);
    Double randomStandard = ThreadLocalRandom.current().nextDouble(51000.0, 120000.0 + 1);
    Double randomPremium = ThreadLocalRandom.current().nextDouble(121000.0, 1000000.0 + 1);


    @Override
    public void Saleable(Human player, Human client, Double price) throws Exception {

    }
}
