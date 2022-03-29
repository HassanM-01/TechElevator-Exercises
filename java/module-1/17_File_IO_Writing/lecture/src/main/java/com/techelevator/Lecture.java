package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args)  {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		File thisHereFile = new File ("google.txt");
		String textFileData = "This is your file.\n this file is my file\nthis is for me";
		String appendFileData = "\nIdk i wanna jus have a JoB";

		FileTestingClass ftc = new FileTestingClass();

		try {
			ftc.createFile(thisHereFile);
			ftc.writeData(thisHereFile, textFileData);
			ftc.appendDataToFile(thisHereFile, appendFileData);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.getMessage();
		}





		File newDirectory = new File ("myDirectory");

		if (newDirectory.exists()){
			System.out.println("Directory already exists");
		}else{
			newDirectory.mkdir();
		}

//		File newFileInADirectory = new File("myDirectory", "myFileThatsInADirectory.txt");
//
//		newFileInADirectory.createNewFile();





	}

}
