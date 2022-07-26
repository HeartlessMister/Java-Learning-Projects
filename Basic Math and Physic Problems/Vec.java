package com.company;

import java.util.Scanner;

public class Vec {
    private String name;
    private int i;
    private int j;
    private int k;

    Scanner scanner = new Scanner(System.in);
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public  Vec(String name){
        this.name = name;


        System.out.println("Find i,j and k values inside of the vector...");
        System.out.println("i: ");
        this.i = scanner.nextInt();
        System.out.println("j: ");
        this.j = scanner.nextInt();
        System.out.println("k: ");
        this.k = scanner.nextInt();



    }
}
