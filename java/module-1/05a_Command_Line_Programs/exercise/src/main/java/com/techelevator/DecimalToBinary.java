package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Please enter in a series of integer values (separated by spaces):"); // initial prompt for user input
		String numberInput = userInput.nextLine(); // store input into variable numberInput

		String [] numberArray = numberInput.split(" "); // split string array into an Int array


		int [] intNumberArray = new int[numberArray.length]; //new array of integers

		String [] binaryOutputArray = new String[numberArray.length];

		for (int i =0; i < numberArray.length; i++){
			intNumberArray[i] = Integer.parseInt(numberArray[i]);
		}

		for (int i= 0; i < intNumberArray.length; i++) {
			binaryOutputArray[i] = Integer.toBinaryString(intNumberArray[i]);
			System.out.println(numberArray[i] + " in binary is " + binaryOutputArray[i]);
		}


	}

}
