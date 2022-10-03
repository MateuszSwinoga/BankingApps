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
                break;
            case 2:
                System.out.println("Deposit money: ");
                break;
            case 3:
                System.out.println("Withdraw money: ");
                break;

        }
    }
}