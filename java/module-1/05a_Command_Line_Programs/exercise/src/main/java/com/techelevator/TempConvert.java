package com.techelevator;


import java.util.Objects;
import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the temperature"); //initial prompt to user
		String tempInput = scanner.nextLine(); //store the input into variable lineInput
		int temperatureInt = Integer.parseInt(tempInput); //convert the string var to an Int

		System.out.println("Is the temperature C or F?"); //measurement input
		String measurementInput = scanner.nextLine(); //store user input into measurementInput

		if (Objects.equals(measurementInput, "C") || Objects.equals(measurementInput, "c")) {   //check to see if temp is in celsius or Fahrenheit

			System.out.println((temperatureInt * 1.8) +32 +" F"); // print input temp
			System.out.println("is " + temperatureInt + " C"); // print converted temp
		}

		else	System.out.println((temperatureInt - 32)/1.8 + " C"); // print input temp

				System.out.println("is " + temperatureInt + " F"); // print converted temp

	}

}
