package com.techelevator.farm.finance;

import com.techelevator.farm.animals.Egg;
import com.techelevator.farm.animals.Pig;
import com.techelevator.farm.interfaces.Sellable;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class InvoiceTest {
    Invoice invoice = new Invoice();
    Map<Sellable, Integer> cart = new HashMap<>();

    @Test
    public void cartAddMethod(){
       Invoice invoice = new Invoice();
       cart.get(new Egg());
        int quantity = 2;
        Sellable product = new Egg();
        Map<Sellable,Integer> expected = new HashMap<>();


        expected.put(product,quantity);


    }

}