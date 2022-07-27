package com.company;
import java.util.Scanner;

public class Login {

    public boolean login(Account account) {

        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Please enter your username: ");
        userName = scanner.nextLine();
        System.out.println("Please enter your password: ");
        password = scanner.nextLine();

        if (account.getUserName().equals(userName) && account.getPassword().equals(password)) {
            return (true);
        } else {

            System.out.println("Your password or username is wrong but I won't say which one.");
            return (false);

        }


    }

}
