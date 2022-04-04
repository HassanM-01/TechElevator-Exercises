package com.techelevator.farm.animals;

public class Cow extends FarmAnimal {

	public Cow() {
		super("Cow", "moo!");
	}

	public String eat(){
		return "beef";
	}

}