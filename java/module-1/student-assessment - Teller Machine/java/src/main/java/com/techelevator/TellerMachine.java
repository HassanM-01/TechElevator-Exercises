package com.techelevator;

import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class TellerMachine {
    private String manufacturer;
    private BigDecimal deposit;
    private BigDecimal withdrawal;
    private BigDecimal balance;

    public TellerMachine(String manufacturer, BigDecimal deposit, BigDecimal withdrawal) {
        this.manufacturer = manufacturer;
        this.deposit = deposit;
        this.withdrawal = withdrawal;
        this.balance = deposit.subtract(withdrawal);
    }

    public boolean validCard(String cardNumber) {
        if (cardNumber.substring(0,1).equals("5")  && cardNumber.length() == 16){
            return true;
        }
        if (cardNumber.substring(0,1).equals("4") && ( cardNumber.length() == 13 || cardNumber.length() == 16)) {
            return true;
        }
        if (cardNumber.startsWith("34") || cardNumber.startsWith("37")) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MANUFACTURER - " + manufacturer + " - " +
                 balance;

    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }
}
