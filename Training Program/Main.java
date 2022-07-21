package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    // The Antrenman Program -->   antrenman (burpeenumber, pushupnumber, situpnumber, squadnumber

        Antrenman antrenman1 = new Antrenman(50,50,50,50);

        Scanner scanner = new Scanner(System.in);


        while(!(antrenman1.anternmanIsFinished())){
            System.out.println("Antrenman type that you completed?(Burpee, Pushup, Situp, Squat) : ");
            String round = scanner.nextLine();
            System.out.println("How many times you have done it?");
            int number = scanner.nextInt();
            scanner.nextLine();
            antrenman1.doMovements(round, number);

        }


    }

}

