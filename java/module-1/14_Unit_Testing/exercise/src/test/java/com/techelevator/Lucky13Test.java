package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lucky13Test {

    @Test
    public void arrayWith1ReturnFalse(){
        Lucky13 test = new Lucky13();
        int [] arrayWithOne = new int []{1,4,6};
        boolean expected = false;

        boolean actual = test.getLucky(arrayWithOne);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arrayWith3ReturnFalse(){
        Lucky13 test = new Lucky13();
        int [] arrayWithThree = new int []{3,4,6};
        boolean expected = false;

        boolean actual = test.getLucky(arrayWithThree);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void arrayWithNoneReturnTrue(){
        Lucky13 test = new Lucky13();
        int [] arrayWithNone = new int []{0,4,6};
        boolean expected = true;

        boolean actual = test.getLucky(arrayWithNone);

        Assert.assertEquals(expected,actual);
    }



}