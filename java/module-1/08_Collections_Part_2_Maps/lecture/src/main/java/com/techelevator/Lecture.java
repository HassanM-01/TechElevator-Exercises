package com.techelevator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		Map<String, String> animalGroups = new HashMap<>();

		if (!animalGroups.containsKey(animalName.toLowerCase())) {
			return "unknown";
		} else {
			return animalGroups.get(animalName.toLowerCase);
		}


		Map<Integer, Integer> output = new HashMap<>();

		for (Integer i: ints) {
			if (output.containsKey(i)){
				output.put(i,output.get(i)+1);
			}

			if (!output.containsKey(i)){
				output.put(i, 1);
			}
		}
		return output;

	}

}
