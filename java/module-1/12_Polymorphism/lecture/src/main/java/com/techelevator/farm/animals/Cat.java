package com.techelevator.farm.animals;

public class Cat extends FarmAnimal {
    public Cat(String name, String sound) {
        super(name, sound);
    }


    //public String getSound() {
      //  return "meow";
    //}

    public String eat(){
        return "tuna";
    }
}