package com.company.CezaryBohdanowicz;

public class Car {

    public Car(String brand, String model, Integer mileage, String color, String segment) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.color = color;
       // this.segment = segment;

        if (segment == "premium"){
            this.segment = PREMIUM;
        } else if(segment == "standard"){
            this.segment=STANDARD;
        }else if(segment == "budget"){
            this.segment=BUDGET;
        }
    }

    public final String brand;
   public final String model;
   public final Integer mileage;
   public final String color;
   public String segment;
   static String PREMIUM;
   static String STANDARD;
   static String BUDGET;



}
