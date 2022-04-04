package com.techelevator.application;

import com.techelevator.logger.Logger;
import com.techelevator.models.Car;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UseMenu {

    public void run() throws IOException {
        List<Car> cars = readFromFile();

        boolean shouldLoop = true;
        while(shouldLoop){
            UserOutput.displayHomeScreen();
            String choice = UserInput.getHomeScreenOption();

            if (choice.equals("List")){
                Logger logger = new Logger("myCar");
                logger.write(LocalDateTime.now().toString() + " jus lookin ");
                listAllCars(cars);
            } else if (choice.equals("Filter")){

            }else if (choice.equals("Return")){

            }else if (choice.equals("Exit")){
                shouldLoop = false;
            }
        }

    }

    private List<Car> readFromFile() throws IOException{

        File file = new File("mycars.txt");
        List<Car> carInventory = new ArrayList<>();

        try{
            Scanner fileScanner = new Scanner(file);
            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String [] lineArray = line.split(",");
                Car car = new Car(lineArray[0],lineArray[1],Integer.parseInt(lineArray[2]), Integer.parseInt(lineArray[3]));
                carInventory.add(car);
            }
        } catch (FileNotFoundException e){
            Logger logger = new Logger("logfile.txt");
            logger.write(LocalDateTime.now().toString() + "unable to find mycars.txt");
            logger.close();
            System.exit(0);
        }
                    return carInventory;
    }

    private void listAllCars(List<Car> cars){
        UserOutput.listCars(cars);
    }
}
