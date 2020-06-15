package com.company.CezaryBohdanowicz;

import com.company.CezaryBohdanowicz.Human.Human;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Car {

    public final String brand;
    public final Integer mileage;
    public final String color;
    public final Double price;
    static String PREMIUM = "premium";
    static String STANDARD = "standard";
    static String BUDGET = "budget";
    public ArrayList<Human> owners = new ArrayList<Human>();
    Double randomMileage = ThreadLocalRandom.current().nextDouble(1.0, 400000.0 + 1);

    public Car(String brand, Integer mileage, String color, Double price) {
        this.brand = brand;
        this.mileage = mileage;
        this.color = color;
        this.price = price;

    }



    public String[] brands = {"Mercedes", "Audi", "BMW", "Alfa Romeo", "Fiat", "Volkswagen", "Ford", "Lamborghini", "Ferrari", "Porsche", "Aston Martin", "Opel", "Skoda"};
    public String[] colors = {"black", "white", "red", "blue", "yellow", "green", "grey"};
    public String[] parts = {"brakes", "suspension", "engine", "body", "shifting gear"};

    public String setSegment() {
        if (this.brands.equals("Fiat") || this.brands.equals("Skoda") || this.brands.equals("Opel") || this.brands.equals("Ford") || this.brands.equals("Volkswagen")) {
            return BUDGET;
        }
        if (this.brands.equals("Mercedes") || this.brands.equals("BMW") || this.brands.equals("Audi") || this.brands.equals("Alfa romeo")) {
            return STANDARD;
        } else {
            return PREMIUM;
        }
    }

    Double randomBudget = ThreadLocalRandom.current().nextDouble(5000.0, 50000.0 + 1);
    Double randomStandard = ThreadLocalRandom.current().nextDouble(51000.0, 120000.0 + 1);
    Double randomPremium = ThreadLocalRandom.current().nextDouble(121000.0, 1000000.0 + 1);


}
