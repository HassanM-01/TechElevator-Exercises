package com.techelevator.ui;

import java.util.Scanner;

public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static String getHomeScreenOption(){
        System.out.println("What would you like to do?");

        System.out.println("1. Search all cars");
        System.out.println("2. Search by filter");
        System.out.println("3. Return a car");
        System.out.println("4. Exit menu");

        System.out.println("Please select an option: ");

        String selectedOption = scanner.nextLine();
        String option = selectedOption.trim().toLowerCase();

        switch (option){
            case "1":
                return "List";
            case "2":
                return "Filter";
            case "3":
                return "Return";
            case "4":
                return "Exit";
            default:
                return "";
        }

    }

}
