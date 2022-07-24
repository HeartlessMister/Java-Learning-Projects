package com.company;


import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


/* This project is all about complication of List iteration and how
LinkedList Operation should be made. LinkedList has an advantage over
Arraylist when it comes to time efficiency, however LinkedList arrays carry
(n number of reference for n number of objects) +1 ,so it is not memory efficient  */



public class Main {

    public static void printOperations(){

        System.out.println("0- Show Operations");
        System.out.println("1- Visit next city");
        System.out.println("2- Visit previous city");
        System.out.println("3- Exit");


    }

    public static void visitCities(LinkedList<String> cities){

        ListIterator<String> iterator = cities.listIterator();

        int operation;

        printOperations();

        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){

            System.out.println("City agenda is empty.");

        }

        boolean exit = false;
        boolean moveForward = true;

        while (!exit){

            System.out.println("Choose an operation:");

            operation = scanner.nextInt();
            scanner.nextLine();


            switch (operation){

                case 0:

                    printOperations();
                    break;

                case 1:

                    if(!moveForward) {
                        if(iterator.hasNext()){
                            iterator.next();
                        }

                    moveForward = true;

                    }


                    if (iterator.hasNext()){

                        System.out.println("You are going to "+ iterator.next()+" city");
                    } else {
                        System.out.println("There is no city left to go");
                    }

                    break;

                case 2:

                    if (moveForward){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }

                        moveForward = false;


                    }
                    if (iterator.hasPrevious()){

                        System.out.println("You are turning back to "+ iterator.previous()+" city");
                    } else{
                        System.out.println("You are at the starting point of your trip.");
                    }

                    break;

                case 3:
                    System.out.println("Program is closing");
                    return;

            }














        }







    }

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<String>();

        cities.add("Adana");
        cities.add("Ankara");
        cities.add("Istanbul");


        visitCities(cities);




    }


}