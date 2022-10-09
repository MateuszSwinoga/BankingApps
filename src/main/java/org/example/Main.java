package org.example;

import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Welcom to our Bank");
//        System.out.println("Please, enter your name: ");
//        String name = sc.next();
//        System.out.println("Please, enter your surname: ");
//        String surname = sc.next();/
//        Account user=new Account(name, surname);
        int select;
        int x;

        Account user1 = new Account("Mateusz", "Świnoga");
        Account user2 = new Account("Justyna", "Bolek");
        Account user3 = new Account("Jan", "Kowalski");
        Account user4 = new Account("Tomasz", "Nowak");

        String users[] = {String.valueOf(user1), String.valueOf(user2), String.valueOf(user3), String.valueOf(user4)};


        do {
            System.out.println("Select user:\n1.Show all users\n2.Mateusz Świnoga\n3.Justyna Bolek\n4.Jan Kowalski\n5.Tomasz Nowak\n0.Exit program ");
            select = sc.nextInt();

            switch (select) {
                case 1:

                    System.out.println(user1.details());
                    System.out.println(user2.details());
                    System.out.println(user3.details());
                    System.out.println(user4.details());


                    break;

                case 2:
                    do {
                        System.out.println("Select operation:\n1.User details\n2.Deposit money\n3.Withdraw money\n9.Back to select users\n0.Exit program");
                        select = sc.nextInt();
                        switch (select) {

                            case 1:
                                System.out.println("User details: ");
                                System.out.println(user1.details());
                                break;
                            case 2:
                                System.out.println("Deposit money: ");
                                System.out.println("How much money do you want to deposit?");
                                int deposit = sc.nextInt();
                                user1.deposit(deposit);  // aktualizacja/podmina danych w klasie Account
                                System.out.println("Money after deposit:" + user1.getBalance());
                                break;
                            case 3:
                                System.out.println("Withdraw money: ");
                                System.out.println("How much do you want to withdraw?");
                                int withdraw = sc.nextInt();
                                if (user1.getBalance() >= withdraw) {
                                    user1.withdraw(withdraw); // aktualizacja/podmina danych w klasie Account
                                    System.out.println("Money after withdraw: " + user1.getBalance());
                                } else {
                                    System.out.println("We cant do this operation becouse your account balance is under withdraw value");
                                }
                        }
                    }
                    while (select!=9&select!=0);

                    break;

                    case 3:
                        do {
                            System.out.println("Select operation:\n1.User details\n2.Deposit money\n3.Withdraw money\n9.Back to select users\n0.Exit program");
                            select = sc.nextInt();
                            switch (select) {

                                case 1:
                                    System.out.println("User details: ");
                                    System.out.println(user2.details());
                                    break;
                                case 2:
                                    System.out.println("Deposit money: ");
                                    System.out.println("How much money do you want to deposit?");
                                    int deposit = sc.nextInt();
                                    user2.deposit(deposit);  // aktualizacja/podmina danych w klasie Account
                                    System.out.println("Money after deposit:" + user2.getBalance());
                                    break;
                                case 3:
                                    System.out.println("Withdraw money: ");
                                    System.out.println("How much do you want to withdraw?");
                                    int withdraw = sc.nextInt();
                                    if (user2.getBalance() >= withdraw) {
                                        user2.withdraw(withdraw); // aktualizacja/podmina danych w klasie Account
                                        System.out.println("Money after withdraw: " + user2.getBalance());
                                    } else {
                                        System.out.println("We cant do this operation becouse your account balance is under withdraw value");
                                    }

                            }
                        }while (select!=9&select!=0);

                        break;
                    case 4:
                        do {
                            System.out.println("Select operation:\n1.User details\n2.Deposit money\n3.Withdraw money\n9.Back to select users\n0.Exit program");
                            select = sc.nextInt();
                            switch (select) {

                                case 1:
                                    System.out.println("User details: ");
                                    System.out.println(user3.details());
                                    break;
                                case 2:
                                    System.out.println("Deposit money: ");
                                    System.out.println("How much money do you want to deposit?");
                                    int deposit = sc.nextInt();
                                    user3.deposit(deposit);  // aktualizacja/podmina danych w klasie Account
                                    System.out.println("Money after deposit:" + user3.getBalance());
                                    break;
                                case 3:
                                    System.out.println("Withdraw money: ");
                                    System.out.println("How much do you want to withdraw?");
                                    int withdraw = sc.nextInt();
                                    if (user3.getBalance() >= withdraw) {
                                        user3.withdraw(withdraw); // aktualizacja/podmina danych w klasie Account
                                        System.out.println("Money after withdraw: " + user3.getBalance());
                                    } else {
                                        System.out.println("We cant do this operation becouse your account balance is under withdraw value");
                                    }

                            }
                        }while (select!=9&select!=0);
                        break;
                    case 5:
                        do {
                            System.out.println("Select operation:\n1.User details\n2.Deposit money\n3.Withdraw money\n9.Back to select users\n0.Exit program");
                            select = sc.nextInt();
                            switch (select) {

                                case 1:
                                    System.out.println("User details: ");
                                    System.out.println(user4.details());
                                    break;
                                case 2:
                                    System.out.println("Deposit money: ");
                                    System.out.println("How much money do you want to deposit?");
                                    int deposit = sc.nextInt();
                                    user4.deposit(deposit);  // aktualizacja/podmina danych w klasie Account
                                    System.out.println("Money after deposit:" + user4.getBalance());
                                    break;
                                case 3:
                                    System.out.println("Withdraw money: ");
                                    System.out.println("How much do you want to withdraw?");
                                    int withdraw = sc.nextInt();
                                    if (user4.getBalance() >= withdraw) {
                                        user4.withdraw(withdraw); // aktualizacja/podmina danych w klasie Account
                                        System.out.println("Money after withdraw: " + user4.getBalance());
                                    } else {
                                        System.out.println("We cant do this operation becouse your account balance is under withdraw value");
                                    }

                            }
                        }while(select!=9&select!=0);
                        break;
                }

        }
            while (select != 0) ;



    }
}