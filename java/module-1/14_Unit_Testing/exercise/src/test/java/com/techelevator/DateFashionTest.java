package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateFashionTest {

    @Test
    public void bothPeopleareStylishShouldReturn2(){
        DateFashion getTable = new DateFashion();
        int imAten = 10;
        int shesAten = 10;
        int expected = 2;

        int actual = getTable.getATable(imAten, shesAten);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void onePersonisStylishShouldReturn0(){
        DateFashion getTable = new DateFashion();
        int imAten = 10;
        int shesAone = 1;
        int expected = 0;

        int actual = getTable.getATable(imAten, shesAone);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void bothPeopleareNotstylishShouldreturn0(){
        DateFashion getTable = new DateFashion();
        int imAone = 1;
        int shesAone = 1;
        int expected = 0;

        int actual = getTable.getATable(imAone, shesAone);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void onePersonIsStylishShouldReturn1(){
        DateFashion getTable = new DateFashion();
        int imAten = 10;
        int shesAsix = 6;
        int expected = 1;

        int actual = getTable.getATable(imAten, shesAsix);

        Assert.assertEquals(expected,actual);

    }



}