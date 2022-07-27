package com.company;

import java.util.Scanner;

public class Atm {


    public void work(Account account) {

        Login login = new Login();


        System.out.println("*******************");
        System.out.println("Welcome to our ATM");
        System.out.println("*******************");

        int enterenceRight = 3;

        while (true) {

            if (login.login(account) == true) {

                System.out.println("Welcome to our system");
                break;
            } else {

                System.out.println("Welcome to our system");
                enterenceRight--;

                if (enterenceRight == 0) {
                    System.out.println("You have made three failed enterance attemt... Your account suspended for five miniutes!");
                    return;
                }
            }
        }

        System.out.println("***********************");

        String operations = "1. Show balance\n" +
                "2. Deposit\n" +
                "3. Withdraw\n" +
                "Press q in order to exit";

        double amount;
        while (true) {

            System.out.println(islemler);
            Scanner scanner = new Scanner(System.in);

            String operation = scanner.nextLine();

            if (operation.equals("1")) {
                System.out.println("Bakiyeniz:" + account.getBakiye());
            } else if (operation.equals("2")) {

                System.out.println("Enter the amount that you want to deposit: ");

                amount = scanner.nextDouble();

                account.deposit(amount);

            } else if (operation.equals("3")) {

                System.out.println("Enter the amount that you want to deposit: ");

                amount = scanner.nextDouble();

                account.withdraw(amount);

            } else if (islem.equals("q")) {

                break;

            } else {

                System.out.println("Wrong operation!");
            }


        }


    }

}





