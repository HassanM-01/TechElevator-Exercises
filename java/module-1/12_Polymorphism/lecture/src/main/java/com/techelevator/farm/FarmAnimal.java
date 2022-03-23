package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {
	private String name;
	private String sound;
	private boolean isSleeping;

	public FarmAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public String getName() {
		return name;
	}

	public final String getSound() {
		if (isSleeping){
			return "Zzzz..";
		}
		return sound;
	}

	public void sleep(boolean isSleeping){
		this.isSleeping = isSleeping;
	}

	public abstract String eat();

}