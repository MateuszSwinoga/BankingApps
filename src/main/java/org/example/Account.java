package org.example;

public class Account {
    private String name;
    private String surname;
    private int accountNumber;
    private float balance;

   public  Account(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.accountNumber = 1;
        this.balance = 105;
    }

    public String details() {
        String details = "name:" +name + "\nsurname:" + surname + "\naccountNumber:" + accountNumber + "\nbalance:" + balance;
        return details;

    }
    public void deposit(int deposit) {
        this.balance = balance + deposit;
    }

    public void withdraw(int withdraw) { // void nic nie zwraca. Metoda zwraca z parametrów metody w "()"
        this.balance = balance - withdraw;
    }

        public float getBalance(){
            return balance;

        }

    }







