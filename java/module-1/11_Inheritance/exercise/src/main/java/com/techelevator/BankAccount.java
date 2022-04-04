package com.techelevator;

public class BankAccount {
    private String accountHolderName;
    private String accountNumber;
    private int balance = 0;

    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int deposit (int amountToDeposit){
        balance+=amountToDeposit;
        return amountToDeposit + balance;
    }

    public int withdraw (int amountToWithdraw){
        balance-=amountToWithdraw;
        return balance - amountToWithdraw;

    }




    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
