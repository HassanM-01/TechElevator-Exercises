package com.techelevator;
import java.util.Set;
import java.util.HashSet;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> cartoonShows = new HashSet<>();
        cartoonShows.add("Ed Edd & Eddy");
        cartoonShows.add("King of Hill");
        cartoonShows.add("Family Guy");
        cartoonShows.add("Futurama");
        cartoonShows.add("South Park");

        System.out.println(cartoonShows.contains("The Simpsons"));
        System.out.println(cartoonShows.remove("Ed Edd & Eddy"));

        System.out.println(cartoonShows.size());

        for (String cartoonShow: cartoonShows){
            System.out.println(cartoonShow);
        }
    }
}