package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner userInput = new Scanner(System.in);


		System.out.println("Enter file path: ");
		String path = userInput.nextLine();
		System.out.println("Enter a word: ");
		String searchWord = userInput.nextLine();

		File bookFile = new File(path);

		try (Scanner fileInput = new Scanner(bookFile)) {

			int lineCount = 0;

			while (fileInput.hasNextLine()) {
				String lineOfText = fileInput.nextLine();
				lineCount++;
				if (lineOfText.toLowerCase().contains(searchWord.toLowerCase())) {
					System.out.println(lineCount + ") " + lineOfText);
				}

			}


		} catch (FileNotFoundException e) {
			System.out.println("Your file doesn't exist");


		}


	}
}
