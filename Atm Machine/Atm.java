package com.company;

import java.util.Scanner;

public class Atm {


    public void work(Account account) {

        Login login = new Login();


        System.out.println("*******************");
        System.out.println("Welcome to our ATM");
        System.out.println("*******************");

        int girisHakki = 3;

        while (true) {

            if (login.login(account) == true) {

                System.out.println("Welcome to our system");
                break;
            } else {

                System.out.println("Welcome to our system");
                girisHakki--;

                if (girisHakki == 0) {
                    System.out.println("Şifrenizi 3 kere yanlış girdiniz, işleminiz sonlandırılıyor...");
                    return;
                }
            }
        }

        System.out.println("***********************");

        String islemler = "1. Bakiye goruntule\n" +
                "2. Para Yatirma\n" +
                "3. Para Cekme\n" +
                "Cikis icin q'ya basiniz";


        while (true) {

            System.out.println(islemler);
            Scanner scanner = new Scanner(System.in);

            String islem = scanner.nextLine();

            if (islem.equals("1")) {
                System.out.println("Bakiyeniz:" + account.getBakiye());
            } else if (islem.equals("2")) {

                System.out.println("Yatırmak istediğiniz miktarı giriniz:");

                double tutar = scanner.nextDouble();

                account.paraYatirma(tutar);

            } else if (islem.equals("3")) {

                System.out.println("Çekmek istediğiniz tutarı giriniz:");

                double tutar = scanner.nextDouble();

                account.paraCekme(tutar);

            } else if (islem.equals("q")) {

                break;

            } else {

                System.out.println("Yanlıs islem girdiniz");
            }


        }


    }

}





