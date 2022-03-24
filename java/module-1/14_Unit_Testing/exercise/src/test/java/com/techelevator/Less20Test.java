package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Less20Test {


    @Test
    public void enter20ReturnFalse(){
        Less20 test = new Less20();
        int insert20 = 20;
        boolean expected = false;

        boolean actual = test.isLessThanMultipleOf20(insert20);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void enter41ReturnTrue(){
        Less20 test = new Less20();
        int insert40 = 40;
        boolean expected = false;

        boolean actual = test.isLessThanMultipleOf20(insert40);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void enter38ReturnFalse(){
        Less20 test = new Less20();
        int insert38 = 38;
        boolean expected = true;

        boolean actual = test.isLessThanMultipleOf20(insert38);

        Assert.assertEquals(expected,actual);
    }


}