package com.company;
import java.util.Scanner;

public class Login {

    public boolean login(Account account) {

        Scanner scanner = new Scanner(System.in);
        String kullanıcı_adi;
        String parola;

        System.out.println("Lütfen kullanıcı adınızı giriniz");
        kullanıcı_adi = scanner.nextLine();
        System.out.println("Lütfen parolanızı giriniz");
        parola = scanner.nextLine();

        if (account.getKullanici_adi().equals(kullanıcı_adi) && account.getParola().equals(parola)) {
            return (true);
        } else {

            System.out.println("Kullanıcı adınız veya şifreniz hatalıdır ama hangisi söylemem.");
            return (false);

        }


    }

}