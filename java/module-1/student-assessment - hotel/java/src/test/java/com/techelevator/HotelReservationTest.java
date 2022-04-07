package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HotelReservationTest {

    @Test
    public void estimatedTotal() {
        HotelReservation hotelReservation = new HotelReservation();
        double expected = 59.99;

       double actual = hotelReservation.estimatedTotal(59.99,1);

        assertEquals(expected,actual,0);
    }




    @Test
    public void nameANdNumberConstructor() {
        HotelReservation hotelReservation = new HotelReservation();
        String name = "Josh Franklin";
        int nights = 5;


    }

    @Test
    public void totalCostConstructor() {
        HotelReservation hotelReservation = new HotelReservation();


    }
}