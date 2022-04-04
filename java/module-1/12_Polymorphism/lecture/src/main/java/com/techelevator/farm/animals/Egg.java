package com.techelevator.farm.animals;

import com.techelevator.farm.interfaces.Sellable;

import java.math.BigDecimal;

public class Egg implements Sellable {


    @Override
    public String getName() {
        return "Egg";
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("0.25");
    }
}
