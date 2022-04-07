package com.techelevator.ui;

import com.techelevator.models.Car;

import java.util.List;

public class UserOutput {

    public static void displayHomeScreen(){
        System.out.println();
        System.out.println("********************");
        System.out.println("        Home        ");
        System.out.println("********************");
        System.out.println();
    }

    public static void listCars(List<Car> cars){
        for (Car car: cars){
            System.out.println(car.getMake() + " " +  car.getModel() + " " + car.getYear());
        }
    }

}
