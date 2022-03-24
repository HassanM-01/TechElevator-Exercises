package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NonStartTest {

    @Test
    public void helloThereReturnElloHere(){
        NonStart test = new NonStart();
        String hello = "Hello";
        String there = "There";
        String expected = "ellohere";

        String actual = test.getPartialString(hello,there);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void emptyReturnNull(){
        NonStart test = new NonStart();
        String empty1 = "";
        String empty2 = "";
        String expected = "";

        String actual = test.getPartialString(empty1,empty2);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void emptyThereReturnHere(){
        NonStart test = new NonStart();
        String empty = "";
        String there = "There";
        String expected = "here";

        String actual = test.getPartialString(empty,there);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void thereEmptyReturnHere(){
        NonStart test = new NonStart();
        String here = "There";
        String there = "";
        String expected = "here";

        String actual = test.getPartialString(here,there);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void nullNullReturnEmpty(){
        NonStart test = new NonStart();
        String empty = "2";
        String there = "4";
        String expected = "";

        String actual = test.getPartialString(empty,there);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void NullReturnEmpty(){
        NonStart test = new NonStart();
        String nully = null;
        String nullee = null;
        String expected = "";

        String actual = test.getPartialString(nully,nullee);

        Assert.assertEquals(expected,actual);
    }
}