package com.techelevator;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void runThisBeforeMyTest(){
        System.out.println("before practice");
    }

    @After
    public void runThisAfter(){
        System.out.println("after practice");
    }

    @Test
    public void addTwoPlusTwoReturn4(){
      Calculator calc = new Calculator();
      int numberToAdd = 2;
      int expected = 4;
      //arrange
      int actual = calc.add2Numbers(numberToAdd,numberToAdd);
        //act
        Assert.assertEquals(expected,actual);
        //assert
    }

    @Test
    public void addTwoTripleDigitNumbers(){
        //arrange
        Calculator calc = new Calculator();
        int numberOne = 100;
        int numberTwo = 200;
        int expected = 300;
        //act
        int actual = calc.add2Numbers(numberOne,numberTwo);
        //assert
        Assert.assertEquals(expected,actual);
    }



}