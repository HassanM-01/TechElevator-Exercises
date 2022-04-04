package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a destination file path: ");
		String destinationPath = userInput.nextLine();

		File destinationFile = new File(destinationPath);
		String outPut = "";

		try (PrintWriter writer = new PrintWriter(destinationFile)){
			for (int i = 1; i<= 300; i++){
				if (i % 3 == 0 && i % 5 == 0) {
					outPut = "FizzBuzz";
				}else if (i % 5 == 0){
					outPut = "Buzz";
				}else if (i % 3 == 0){
					outPut = "Fizz";
				}else {
					outPut = Integer.toString(i);
				}
				writer.println(outPut);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File does not exist");
		}

	}

}
