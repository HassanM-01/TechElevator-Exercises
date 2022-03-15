package com.techelevator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lecture {

	public static void main(String[] args) {
		System.out.println("####################");
		System.out.println("       LISTS");
		System.out.println("####################");

		List<String> candyNames = new ArrayList<>();

		candyNames.add("3 Musketeers");
		candyNames.add("kitkat");
		candyNames.add("PayDay");
		candyNames.add("ButterFinger");
		candyNames.add("Peppermint Patties");
		candyNames.add("Toblerone");
		candyNames.add("Now and Later");

		System.out.println("####################");
		System.out.println("Lists are ordered");
		System.out.println("####################");

		for (String candyName : candyNames) {
			System.out.println(candyName);
		}

		for (int i = 0; i < candyNames.size(); i++) {
			System.out.println(candyNames.get(i));
		}

		System.out.println("####################");
		System.out.println("Lists allow duplicates");
		System.out.println("####################");


		System.out.println("####################");
		System.out.println("Lists allow elements to be inserted in the middle");
		System.out.println("####################");

		//  candyNames.add(candyNames.size()/2, "snickers");

		System.out.println("####################");
		System.out.println("Lists allow elements to be removed by index");
		System.out.println("####################");

		// candyNames.remove("skittles");

		System.out.println("####################");
		System.out.println("Find out if something is already in the List");
		System.out.println("####################");

		candyNames.contains("kitkat");

		System.out.println("####################");
		System.out.println("Find index of item in List");
		System.out.println("####################");

		candyNames.indexOf("PayDay");

		System.out.println("####################");
		System.out.println("Lists can be turned into an array");
		System.out.println("####################");

		String [] candyArray = candyNames.toArray(new String[0]);

		System.out.println("####################");
		System.out.println("Lists can be sorted");
		System.out.println("####################");

		Collections.sort(candyNames);

		System.out.println("####################");
		System.out.println("Lists can be reversed too");
		System.out.println("####################");

		Collections.reverse(candyNames);

		System.out.println("####################");
		System.out.println("       FOREACH");
		System.out.println("####################");
		System.out.println();


		Integer biggestNumber = integerList.get(0);

		for (Integer i: integerList) {
			if (biggestNumber < i){
				biggestNumber = i;
			}
		}

		return biggestNumber;



		String [] stringArray = stringArray = stringList.toArray (new String[0]);
		return stringArray;







	}
}
