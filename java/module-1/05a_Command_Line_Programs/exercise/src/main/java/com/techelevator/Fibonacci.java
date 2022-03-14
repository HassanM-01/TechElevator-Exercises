package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int firstNum= 0;
		int secondNum= 1;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a number"); //initial prompt to user
		String numberInput = scanner.nextLine(); //store the input into variable lengthInput
		int numberInt = Integer.parseInt(numberInput); //convert the string var to an Int

		if (numberInt == 0) {
			System.out.println("0,1");
		}
		else if (numberInt>0) {


		while (firstNum <= numberInt) {

			System.out.print(firstNum + ", ");

			int nextNum = firstNum + secondNum; //result equals 1 + 0
			firstNum = secondNum; // reassigning the number placement
			secondNum = nextNum; // ^^
		}

	}

	}

}



