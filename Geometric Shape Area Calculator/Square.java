package com.company;

public class Square extends Shape{
    private int edge;

    public Square(String name, int edge) {
        super(name);
        this.edge = edge;
    }

    @Override
    void calculateArea() {

        int area = edge*edge;

        System.out.println(getName()+"'s area is "+area);
    }
}
