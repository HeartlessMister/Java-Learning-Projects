package com.company;

public class Triangle extends Shape{

    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    void calculateArea() {
        double u = (a+b+c)/2.0;

        double area = Math.sqrt(u*(u-a) * (u-b) * (u-c)) ;

        System.out.println(getName()+"'s area is "+area);

    }
}

