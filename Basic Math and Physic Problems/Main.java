package com.company;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Math and Physics problems calculator");

        String operations = "Operations: \n"+
                            "1. Circle area calculation\n"+
                            "2. Triangle perimeter calculation\n"+
                            "3. Dot product of a two vectors\n"+
                            "4. Exit: 4";

        while(true){
            System.out.println(operations);
            System.out.println("Please choose an operation");
            String operation = scanner.nextLine();

            if (operation == "q"){

                System.out.println("You are leaving the program");
                break;
            }else if (operation.equals("1")){

                System.out.println("Please enter the radius of the circle in m:");
                float radius = scanner.nextFloat();
                scanner.nextLine();
                Problem.Mathematics.circleArea(radius);

            }else if (operation.equals("2")){
                System.out.println("Please enter the first edge of the triangle");
                float edge1 = scanner.nextFloat();
                System.out.println("Please enter the second edge of the triangle");
                float edge2 = scanner.nextFloat();
                System.out.println("Please enter the third edge of the triangle");
                float edge3 = scanner.nextFloat();
                scanner.nextLine();
                Problem.Mathematics.trianglePerimeter(edge1,edge2,edge3);

            }else if (operation.equals("3")){

                Vec vec1 = new Vec("Vector1");
                Vec vec2 = new Vec("Vector2");

                Problem.Physics.dotProduct(vec1,vec2);

            }else {

                System.out.println("Invalid operation...");

            }


        }






    }



    }


