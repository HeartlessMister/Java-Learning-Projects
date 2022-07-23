package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Beyblade Program");
        System.out.println("Press q to close the program");


        while (true) {

            System.out.println("Which Beyblade do you want?");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            BeybladeFactory factory = new BeybladeFactory();
            Beyblade beyblade;

            if (choice.equals("q")) {
                break;
            } else {

                if (new BeybladeFactory().manufactureBayblade(choice) == null) {
                    System.out.println("Please provide a valid beyblade name, press q to quit");
                } else {
                    beyblade = factory.manufactureBayblade(choice);
                    beyblade.showInformation();
                    beyblade.holySpirit();
                    beyblade.attack();
                }


            }


        }


    }


}
