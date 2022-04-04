package com.techelevator;

import java.io.*;

public class FileTestingClass {

    public void createFile (File thisHereFile) throws IOException {
        if (thisHereFile.exists()){
            System.out.println("File Name: " + thisHereFile.getName());
            System.out.println("Absolute Path: " + thisHereFile.getAbsolutePath());
            System.out.println("Writable: " + thisHereFile.canWrite());
            System.out.println("Readable: " + thisHereFile.canRead());
            System.out.println("File size in bytes: " + thisHereFile.length());
        } else {
            System.out.println("This file does not exist, so imma create it");
            thisHereFile.createNewFile();
        }
    }


    public void writeData (File thisHereFile, String textFileData) throws FileNotFoundException {
        try (PrintWriter ghostWriter = new PrintWriter(thisHereFile)) {
            ghostWriter.print(textFileData);
        }
    }

    public void appendDataToFile (File thisHereFile, String textFileData) throws FileNotFoundException {
        FileOutputStream stream = new FileOutputStream(thisHereFile, true);
        try (PrintWriter ghostWriter = new PrintWriter(stream)){
            ghostWriter.print(textFileData);
        }
    }

}
