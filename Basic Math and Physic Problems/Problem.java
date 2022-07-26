package com.company;

import java.util.Scanner;

public class Problem {

    private Scanner scanner = new Scanner(System.in);

    public static class Mathematics{

        public static void circleArea(float radius){

            System.out.println("The area of the circle: "+ (Math.PI *radius*radius));

        }

        public static void trianglePerimeter(float edge1, float edge2, float edge3){

            System.out.println("The perimeter of the triangle: " +(edge1+edge2+edge3));

        }

    }

    public static class Physics{

        public static void dotProduct(Vec vec1, Vec vec2){
            System.out.println(vec1.getI()+ vec1.getK()+ vec1.getJ());
            int dotProduct = vec1.getI()* vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getName()+" and "+ vec2.getName()+"'s dot product is"+dotProduct);

        }



    }
}
