package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args)  {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the search word: ");
        String searchWord = userInput.nextLine();
        System.out.println("Enter the replacement word: ");
        String replacementWord = userInput.nextLine();
        System.out.println("Enter path to the source file: ");
        String filePath = userInput.nextLine();
        System.out.println("Enter the destination file: ");
        String destinationFilePath = userInput.nextLine();

        File returnFile = new File(destinationFilePath);
        File inputFile = new File (filePath);
        Scanner fileInput = null;
        try {
            fileInput = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try ( PrintWriter writer = new PrintWriter(returnFile)){

            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();

                writer.println(lineOfText.replaceAll(searchWord,replacementWord));

            }


        } catch (FileNotFoundException e) {
            System.out.println("Your file does not exist :(");
            e.printStackTrace();
        }



        try (PrintWriter writer = new PrintWriter(new FileOutputStream(destinationFilePath,true))) {

        } catch (FileNotFoundException e){
            System.out.println("it didnt work buddy");
        }


    }



}
