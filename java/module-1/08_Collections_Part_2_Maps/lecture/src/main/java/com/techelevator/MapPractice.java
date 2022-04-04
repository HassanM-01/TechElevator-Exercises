package com.techelevator;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;


public class MapPractice {
    public static void main(String[] args){

        //Declare a Map
        Map<Integer, String> mapOfPuns = new HashMap<>();
        //Adding things to a map
        mapOfPuns.put(1, "Punny People");
        mapOfPuns.put(2, "Two priests walk into a bar");
        mapOfPuns.put(3,"Writing with a dull pencil is pointless");
        mapOfPuns.put(4,"The duck told the bartender put it on my bill");
        mapOfPuns.put(5,"A salt with a deadly weapon");
        //If a particular key or value exists in a map
        System.out.println(mapOfPuns.containsKey(1));
        System.out.println(mapOfPuns.containsValue("Writing with a dull pencil is pointless"));
        System.out.println(mapOfPuns.containsKey(7));
        //Retrieving a value by key from a map
        System.out.println(mapOfPuns.get(3));
        //Removing items from a map
        mapOfPuns.remove(4);
        System.out.println(mapOfPuns.size());

        //Iterating over a map
        Set<Integer> keys = mapOfPuns.keySet();

        for (Integer k: keys){
            System.out.println(mapOfPuns.get(k));
        }
    }
}
