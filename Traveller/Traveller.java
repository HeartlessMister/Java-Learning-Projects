package com.company;

import java.util.Scanner;

public class Traveller implements AbroadTripRules {
    private int abroadTravelFee;
    private boolean politicalBan;
    private boolean visaStatus;

    public Traveller() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the trip fee you deposited");

        this.abroadTravelFee = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you have any political ban? y/n");

        String answer = scanner.nextLine();

        if (answer.equals("y")) {

            System.out.println("You have political ban, you cannot go outside of the country");
            this.politicalBan = true;

        } else if (answer.equals("n")) {
            this.politicalBan = false;
            System.out.println("You do not have political ban");

        } else {
            this.politicalBan = true;
            System.out.println("Please provide a valid answer");
        }
        System.out.println("Do you have valid visa to travel our country? y/n");

        String answer2 = scanner.nextLine();

        if (answer2.equals("y")) {

            System.out.println("Visa is checked, you are allowed to the country");

            this.visaStatus = true;


        } else if (answer.equals("n")) {
            System.out.println("Visa is checked, you are not allowed to the country");
            this.visaStatus = false;

        } else {
            this.visaStatus = false;
            System.out.println("Please provide a valid answer");
        }


    }

    @Override
    public boolean abroadTravelFeeCheck() {
        if (this.abroadTravelFee < 15) {
            System.out.println("Please make your payment fully.  ");
            return false;
        } else {
            System.out.println("Sufficient abroad fee acquired.");
            return true;

        }

    }

    @Override
    public boolean politicalBanCheck() {
        if (this.politicalBan = true) {
            System.out.println("You don't have any political restrictions.");
            return false;
        } else {
            System.out.println("You are not allowed to visit a country due to political travelling ban! ");

            return true;

        }
    }

    @Override
    public boolean visaStatusCheck() {
        if (this.visaStatus = true) {
            System.out.println("Visa status checked and approved");
            return true;
        } else {
            System.out.println("YYou don't have any valid visa to travel");
            return false;

        }
    }

}
