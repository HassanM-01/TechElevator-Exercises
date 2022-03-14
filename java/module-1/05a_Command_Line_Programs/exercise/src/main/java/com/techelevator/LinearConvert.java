package com.techelevator;

import java.util.Objects;
import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the length"); //initial prompt to user
		String lengthInput = scanner.nextLine(); //store the input into variable lengthInput
		int lengthInt = Integer.parseInt(lengthInput); //convert the string var to an Int

		System.out.println("Is the length M or F?"); //measurement input
		String unitInput = scanner.nextLine(); //store user input into measurementInput

		if (Objects.equals(unitInput, "m") || Objects.equals(unitInput, "M")) {   //check to see if length is in meters or feet

			System.out.println((lengthInt * 3.2808399) +" F"); // print input length
			System.out.println("is " + lengthInt + " M"); // print converted length
		}

		else	System.out.println((lengthInt *0.3048) + " M"); // print input temp

		System.out.println("is " + lengthInt + " F"); // print converted temp

	}

	}


