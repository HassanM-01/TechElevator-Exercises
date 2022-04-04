package com.techelevator.farm;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        System.out.println("Movie Ticket Prices: ");
        System.out.println("1. Adult = $14");
        System.out.println("2. Child = $8");
        System.out.println("3. Senior = $11");
        System.out.println("Enter a choice ");
        Scanner input = new Scanner(System.in);
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("Enter number of tickets ");
        int quantity = Integer.parseInt(input.nextLine());
        int total = 0;
        switch (choice) {
            case 1:
                total = quantity * 14;
                break;
            case 2:
                total = quantity * 8;
                break;
            case 3:
                total = quantity * 11;
                break;
            default:
                System.out.println("Invalid Entry");
        }
        System.out.println(total);
    }
}
