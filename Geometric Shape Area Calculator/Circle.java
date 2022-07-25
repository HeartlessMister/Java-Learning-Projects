package com.company;

public class Circle extends Shape{

    int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;

        System.out.println(getName()+"'s area is "+area);
    }
}

