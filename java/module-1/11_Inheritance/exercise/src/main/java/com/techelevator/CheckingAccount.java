package com.techelevator;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }

    public CheckingAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (0 > getBalance() - amountToWithdraw && getBalance() - amountToWithdraw > -100) {
            return super.withdraw(amountToWithdraw + 10);

        } else if (getBalance() - amountToWithdraw >= 0) {
            return super.withdraw(amountToWithdraw);
        }
        return getBalance();
    }
}
