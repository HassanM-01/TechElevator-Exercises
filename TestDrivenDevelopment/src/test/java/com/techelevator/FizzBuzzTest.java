package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    FizzBuzz fb = new FizzBuzz();



    @Test

    public void sendInOneReturnAStringOne(){

        //FizzBuzz fb = new FizzBuzz();
        String expected = "1";

        String actual = fb.fizzBuzz(1);

        Assert.assertEquals(expected,actual);

    }

    @Test

    public void sendSevenGetStringSeven(){

        //FizzBuzz fb = new FizzBuzz();
        String expected = "7";

        String actual = fb.fizzBuzz(7);

        Assert.assertEquals(expected,actual);

    }


    @Test

    public void sendThreeReturnFizz(){

        //FizzBuzz fb = new FizzBuzz();
        String expected = "Fizz";

        String actual = fb.fizzBuzz(3);

        Assert.assertEquals(expected,actual);


    }

    @Test

    public void sendInSixReturnFizz(){

        Assert.assertEquals("Fizz", fb.fizzBuzz(6));

    }

    @Test

    public void sendInFiveReturnString(){

        Assert.assertEquals("Buzz", fb.fizzBuzz(5));

    }

    @Test

    public void sendInTenReturnString(){

        Assert.assertEquals("Buzz", fb.fizzBuzz(10));

    }

    @Test

    public void sendInFifteenReturnFizzBuzz(){

        Assert.assertEquals("FizzBuzz",fb.fizzBuzz(15));

    }

}