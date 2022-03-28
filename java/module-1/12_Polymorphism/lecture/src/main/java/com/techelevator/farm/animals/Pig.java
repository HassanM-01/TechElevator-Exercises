package com.techelevator.farm.animals;

public class Pig extends FarmAnimal {

    public Pig (){
        super("Pig","Oink");
    }

    public String eat(){
        return "bacon";
    }
}
