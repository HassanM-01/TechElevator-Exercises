package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CigarPartyTest {

    @Test
    public void isWeekendEnteredWith100CigarsReturnTrue() {
        CigarParty calc = new CigarParty();
        int hundredCigars = 100;
        boolean itIsTheWknd = true;
        boolean expected = true;

        boolean actual = calc.haveParty(hundredCigars, itIsTheWknd);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isNotWeekendEnteredWith100CigarsReturnFalse() {
        CigarParty calc = new CigarParty();
        int hundredCigars = 100;
        boolean itIsTheWknd = false;
        boolean expected = false;

        boolean actual = calc.haveParty(hundredCigars, itIsTheWknd);

        Assert.assertEquals(expected,actual);
    }

}