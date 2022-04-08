package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TellerMachineTest {

    @Test

    public void checkBalanceCalcAmount() {
        TellerMachine actual = new TellerMachine("Bob", new BigDecimal("500.00"),
                new BigDecimal("200.00"));
        BigDecimal expected = new BigDecimal("300.00");

        Assert.assertEquals(expected, actual.getBalance());

    }

    @Test

    public void checkValidCardNumberMethod() {
        TellerMachine tellerMachine = new TellerMachine("Bob", new BigDecimal("500.00"),
                new BigDecimal("200.00"));

        boolean actual = tellerMachine.validCard("5234567891234567");

        Assert.assertTrue(actual);

    }




}