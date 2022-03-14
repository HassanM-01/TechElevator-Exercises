package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter in a series of integer values (separated by spaces):"); // initial prompt for user input
		String numberInput = scanner.nextLine(); // store input into variable numberInput

		String [] stringNumberArray = numberInput.split(" "); // split string array into an Int array
		int [] integerNumberArray = new int[stringNumberArray.length];

		//Integer.toBinaryString(integerNumberArray);


		//int numberInteger = Integer.parseInt(numberInput); // convert string into integers

		//result = Integer.toBinaryString(numberInteger);
		//System.out.println(result);

	}

}
