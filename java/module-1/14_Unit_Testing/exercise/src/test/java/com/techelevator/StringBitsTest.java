package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringBitsTest {

    @Test
    public void helloReturnHlo(){
        StringBits test = new StringBits();
        String hello = "hello";
        String expected = "hlo";

        String actual = test.getBits(hello);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void hiReturnH(){
        StringBits test = new StringBits();
        String hi = "hi";
        String expected = "h";

        String actual = test.getBits(hi);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void heeolelloReturnHello(){
        StringBits test = new StringBits();
        String weirdHello = "heeolello";
        String expected = "hello";

        String actual = test.getBits(weirdHello);

        Assert.assertEquals(expected,actual);

    }

}