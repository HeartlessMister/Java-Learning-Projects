package com.company;
import java.util.Scanner;

public class Login {

    public boolean login(Account account) {

        Scanner scanner = new Scanner(System.in);
        String userName;
        String password;

        System.out.println("Please enter your username: ");
        kullanıcı_adi = scanner.nextLine();
        System.out.println("Please enter your password: ");
        parola = scanner.nextLine();

        if (account.gerUserName().equals(userName) && account.getPassword().equals(password)) {
            return (true);
        } else {

            System.out.println("Your password or username is wrong but I won't say which one.");
            return (false);

        }


    }

}
