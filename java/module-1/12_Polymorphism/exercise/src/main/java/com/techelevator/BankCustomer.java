package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<>();


public Accountable[] getAccounts(){
    Accountable [] arrayOfAccountables = new Accountable[accounts.size()];
    for (int i =0; i < accounts.size(); i++ ){
        arrayOfAccountables[i] = accounts.get(i);


    }
    return arrayOfAccountables;
}

public void addAccount (Accountable newAccount){
    accounts.add(newAccount);
}

public boolean isVip() {
    int total = 0;
    int vipAmount = 25000;

    for (Accountable account: accounts){
        total+=account.getBalance();
    }
    if (total>= vipAmount) {
        return true;
    }
    return false;
}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<com.techelevator.Accountable> getAccountable() {
        return accounts;
    }
}
