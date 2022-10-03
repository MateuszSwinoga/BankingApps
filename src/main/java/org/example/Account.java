package org.example;

public class Account {
    private String name;
    private String surname;
    private int accountNumber;
    private float balance;

    Account(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = 1;
        this.balance = 105;
    }

    public String details() {
        String details = "name:" +name + "\nsurname:" + surname + "\naccountNumber:" + accountNumber + "\nbalance:" + balance;
        return details;

    }




}



