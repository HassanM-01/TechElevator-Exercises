package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalGroupNameTest {
    AnimalGroupName calc;
@Before
public void runThisBefore() {
    AnimalGroupName calc = new AnimalGroupName();

}


    @Test
    public void returnCrashWhenElephantIsEntered() {
        AnimalGroupName calc = new AnimalGroupName();
        String animalInput = "Elephant";
        String expected = "Herd";
        //arrange
        String actual = calc.getHerd(animalInput);
        //act
        Assert.assertEquals(expected, actual);
        //assert

    }

    @Test
    public void returnUnknownWhenWalrusIsEntered(){
        AnimalGroupName calc = new AnimalGroupName();
        String animalInput = "Walrus";
        String expected = "unknown";

        String actual = calc.getHerd(animalInput);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void returnCrashWhenRhinoIsMixedCase(){
        AnimalGroupName calc = new AnimalGroupName();
        String animalInput = "rHiNo";
        String expected = "Crash";

        String actual = calc.getHerd(animalInput);

    }

}