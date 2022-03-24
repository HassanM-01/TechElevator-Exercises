package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrontTimesTest {

    @Test
    public void happy3TimesShouldReturnHapHapHap (){
        FrontTimes test = new FrontTimes();
        String wordInput = "Happy";
        int repeat3Times = 3;
        String expected = "HapHapHap";

        String actual = test.generateString(wordInput,repeat3Times);

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void at3TimesShouldReturnAtAtAt (){
        FrontTimes test = new FrontTimes();
        String wordInput = "At";
        int repeat2Times = 2;
        String expected = "AtAt";

        String actual = test.generateString(wordInput,repeat2Times);

        Assert.assertEquals(expected,actual);


    }

    @Test
    public void nothing3TimesShouldReturnNothing (){
        FrontTimes test = new FrontTimes();
        String wordInput = "";
        int repeat3Times = 3;
        String expected = "";

        String actual = test.generateString(wordInput,repeat3Times);

        Assert.assertEquals(expected,actual);


    }

}