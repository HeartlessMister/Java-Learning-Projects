package com.company;


public class Main {


    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Sabiha Gokcen Airport");

        String rules = "Abroad Trip rules:" +
                "\nYou should not have any political ban to travel" +
                "\nYou should pay your 15 TL abroad travel fee" +
                "\nYou should have obtain visa of the country you want to travel";

        String message = "You should provide all the requirements to travel abroad.";

        while (true) {

            System.out.println("*******************************************");
            System.out.println(message);
            System.out.println("*******************************************");
            System.out.println(rules);


            Traveller traveller = new Traveller();

            System.out.println("Travel abroad fee cost is checking... ");

            Thread.sleep(3000); //for fun

            if (!traveller.abroadTravelFeeCheck()) {

                System.out.println(message);
                continue;
            }
            System.out.println("Political ban situation is checking...");
            Thread.sleep(3000); //for fun

            if (traveller.politicalBanCheck()) {

                System.out.println(message);
                continue;
            }

            System.out.println("Visa is checking...");
            Thread.sleep(3000); //for fun

            if (!traveller.visaStatusCheck()) {
                System.out.println(message);
                continue;
            }
            System.out.println("You are allowed to visit target country");
            break;


        }


    }


}