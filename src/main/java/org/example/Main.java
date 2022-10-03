package org.example;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcom to our Bank");
        System.out.println("Please, enter your name: ");
        String name = sc.next();
        System.out.println("Please, enter your surname: ");
        String surname = sc.next();


    Account user=new Account(name, surname);

        System.out.println("Select operation:\n1.User details\n2.Deposit money\n3.Withdraw money");
        int select = sc.nextInt();

        switch (select) {

            case 1:
                System.out.println("User details: ");
                System.out.println(user.details());
                break;
            case 2:
                System.out.println("Deposit money: ");
                System.out.println("How much money do you want to deposit?");
                int deposit = sc.nextInt();
                user.deposit(deposit);  // aktualizacja/podmina danych w klasie Account
                System.out.println("Money after deposit:" + user.getBalance());
                break;
            case 3:
                System.out.println("Withdraw money: ");
                System.out.println("How much do you want to withdraw?");
                int withdraw = sc.nextInt();
                if (user.getBalance()>=withdraw){
                    user.withdraw(withdraw); // aktualizacja/podmina danych w klasie Account
                    System.out.println("Money after withdraw: " + user.getBalance());
                }
                else {
                    System.out.println("We cant do this operation becouse your account balance is under withdraw value");
                }

                break;

        }
    }
}