package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFirstLastTest {


    @Test
    public void arrayNotOfSizeReturnFalse(){
        SameFirstLast test = new SameFirstLast();
        int [] arrayWithNone = new int []{};
        boolean expected = false;

        boolean actual = test.isItTheSame(arrayWithNone);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void highNumber9ReturnTrue(){
        SameFirstLast test = new SameFirstLast();
        int [] arrayWithNine = new int []{9,4,5,6,9};
        boolean expected = true;

        boolean actual = test.isItTheSame(arrayWithNine);

        Assert.assertEquals(expected,actual);
    }

}