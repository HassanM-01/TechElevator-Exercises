package com.techelevator;

public class HotelReservation {
String name;
int numberOfNights;
double estimatedTotal = getDailyRate() * getNumberOfNights();
double dailyRate = 59.99;
double cleaningFee = 34.99;
double miniBarFee = 12.99;



public double estimatedTotal (double dailyRate, int numberOfNights){
    double estimateTotal = dailyRate * numberOfNights;
    return estimateTotal;

}

public void nameANdNumberConstructor (String name, int numberOfNights){
    this.name = name;
    this.numberOfNights = numberOfNights;
    System.out.println(name + " is staying " + numberOfNights + " night(s)");
}

public double totalCostConstructor (boolean requiresCleaning, boolean usedMinibar){
        double totalCost = 0.00;
    if (!requiresCleaning && !usedMinibar){
        totalCost = estimatedTotal;
    }
    else if (requiresCleaning && !usedMinibar){
        totalCost = estimatedTotal + cleaningFee;
    }
    else if (!requiresCleaning && usedMinibar ) {
        totalCost = estimatedTotal + miniBarFee;
    }
    else {
        totalCost = estimatedTotal + (cleaningFee * 2) + miniBarFee;
    }
    return totalCost;
}


    @Override
    public String toString() {
        return "Reservation" +
                 name + " " + estimatedTotal;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getEstimatedTotal() {
        return estimatedTotal;
    }

    public double getDailyRate() {
        return dailyRate;
    }
}
