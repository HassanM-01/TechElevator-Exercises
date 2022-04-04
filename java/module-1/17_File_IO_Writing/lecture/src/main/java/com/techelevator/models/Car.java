package com.techelevator.models;

public class Car {

    private String make, model, vin;
    private int year, mileage;

    public Car(String make, String model, int year, int mileage){
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
