package com.company;

import java.util.Scanner;

public class Main {

    private static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void printOptions(){

        System.out.println("\t 0- Show Options");
        System.out.println("\t 1- Show Singers");
        System.out.println("\t 2- Add Singer");
        System.out.println("\t 3- Update Singer");
        System.out.println("\t 4- Remove Singer");
        System.out.println("\t 5- Search Singer");
        System.out.println("\t 6- Quit");

    }


    public static void main(String[] args) {
        System.out.println("\t Welcome to Singer Program...");

        printOptions();

        boolean quit = false;

        while(!quit){

            System.out.println("Choose an option");

            int option = scanner.nextInt();
            scanner.nextLine();
            String name;
            int position;



            switch (option){

                case 0:
                    printOptions();
                case 1:
                    System.out.println("Singer List:");
                    singers.printSingerList();
                    System.out.println("-------------");
                    break;
                case 2:
                    System.out.println("Please provide singers name:");
                    name =scanner.nextLine();
                    singers.addSinger(name);
                    System.out.println("Singer name is added to the list");
                    break;
                case 3:
                    System.out.println("Please provide singers name:");
                    name =scanner.nextLine();
                    System.out.println("Please provide singers position");
                    position =scanner.nextInt();
                    scanner.nextLine();

                    singers.updateSingerList(name, position);
                    break;
                case 4:
                    System.out.println("Please provide the name of a singer you want to remove");
                    name =scanner.nextLine();
                    singers.removeSinger(name);
                    break;
                case 5:
                    System.out.println("Please enter the singers name ");
                    name =scanner.nextLine();
                    singers.searchSinger(name);
                    break;

                case 6:
                    quit = true;
                    System.out.println("Program is closing...");
                    break;
            }








        }



    }
}