package com.techelevator;

public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);

    }

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public int withdraw(int amountToWithdraw) {
        if (super.getBalance() - amountToWithdraw >= 150){
            return super.withdraw(amountToWithdraw);
        }

       else if ((getBalance() - amountToWithdraw - 2 >= 0) && (getBalance() - amountToWithdraw) < 150) {
            return super.withdraw(amountToWithdraw + 2);
        }

        else if (getBalance() - (amountToWithdraw + 2) <0){
            return getBalance();
        }
        return getBalance();
    }




}
