package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        String lineInput = scanner.nextLine();
        double discountPercentage = Double.parseDouble(lineInput);


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        lineInput = scanner.nextLine();

        // split the string into an array and convert them into a double
        String [] stringPriceArray = lineInput.split(" ");
        double[] priceArray = new double[stringPriceArray.length];

        for (int i = 0; i < priceArray.length; i++){
        System.out.println ( Double.parseDouble(stringPriceArray[i]) * (discountPercentage/100));

        }
        //calculate the discounted price





    }

}