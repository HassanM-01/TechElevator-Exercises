package com.techelevator.farm.finance;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class AdmissionTicketTest {

    //test for 0 age
    //test for negative age
    // test if age is 18 than ticket should be for an adult and be 15.99
    @Test
    public void priceShouldBe1599WhenAgeIs18(){
        int age = 18;
        BigDecimal expectedPrice = new BigDecimal("15.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "Once you're 18 you're GROWN";

        BigDecimal actualPrice = ticket.getPrice();

        assertEquals(expectedPrice,actualPrice);
    }
    // test if age is 40 than ticket price should be 15.99
    // test if age is 10 then ticket should be for a child and be 9.99
    @Test
    public void priceShouldBe999WhenAgeIs10(){
        int age = 10;
        BigDecimal expectedPrice = new BigDecimal("9.99");
        AdmissionTicket ticket = new AdmissionTicket(age);
        String message = "cuz kids should be cheap";

        BigDecimal actualPrice = ticket.getPrice();

        assertEquals(message,expectedPrice, actualPrice);

    }
    // test if age is 69 then ticket should be for a senior and cost 12.99

}