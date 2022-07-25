package com.company;


import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {


    public static void main(String[] args){

        String operations = "Operations: \n"+
                "1. Calculate Square Area\n"+
                "2. Calculate Triangle Area\n"+
                "3. Calculate Circle Area\n"+
                "Exit: q";

        Scanner scanner = new Scanner(System.in);
        int edge;
        int edge2;
        int edge3;
        int radius;

        String name;
        while(true){

            System.out.println(operations);
            System.out.println("Which geometric shape are you want to calculate?");
            String shapeType = scanner.nextLine();
            if (shapeType.equals("q")){
                System.out.println("You are leaving the program");
                break;



            }else if (shapeType.equals("1")){

                System.out.println("edge in m: ");
                edge = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter your square's name");
                name = scanner.nextLine();
                Square square = new Square(name, edge);
                square.calculateArea();


            } else if (shapeType.equals("2")) {
                System.out.println("edge1 in m: ");
                edge = scanner.nextInt();
                System.out.println("edge2 in m: ");
                edge2 = scanner.nextInt();
                System.out.println("edge3 in m: ");
                edge3 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter your triangle's name");
                name = scanner.nextLine();
                Triangle triangle = new Triangle(name, edge,edge2,edge3);
                triangle.calculateArea();


            }else if (shapeType.equals("3")) {


                System.out.println("radius in m:");
                radius = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Please enter your circle's name");
                name = scanner.nextLine();
                Circle circle = new Circle(name, radius);
                circle.calculateArea();

            }else{
                System.out.println("Invalid Operation");



            }



        }






    }
}

