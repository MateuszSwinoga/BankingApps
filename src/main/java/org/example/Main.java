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


    }
}