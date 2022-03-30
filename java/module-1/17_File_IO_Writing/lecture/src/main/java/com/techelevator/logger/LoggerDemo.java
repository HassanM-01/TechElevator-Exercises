package com.techelevator.logger;

import java.io.IOException;
import java.time.LocalDateTime;

public class LoggerDemo {

    public static void main (String[] args){

        Logger logger = new Logger("logfile.txt");
        String rightNow = LocalDateTime.now().toString();
        logger.write(rightNow + ": Car was dispensed");
        logger.write(rightNow + "Bring it back");

        try{
            logger.close();
        }catch (IOException e){
            System.out.println("There was an error with this file");
        }


    }

}
