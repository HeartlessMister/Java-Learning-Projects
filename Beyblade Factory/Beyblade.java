package com.company;

public class Beyblade {

    private String name;
    private int turningSpeed;
    private int power;

    public Beyblade(String name, int turningSpeed, int power) {
        this.name = name;
        this.turningSpeed = turningSpeed;
        this.power = power;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTurningSpeed() {
        return turningSpeed;
    }

    public void setTurningSpeed(int turningSpeed) {
        this.turningSpeed = turningSpeed;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void attack(){
        System.out.println(getName()+"attacks to target"+getName()+"has turning speed of"+getTurningSpeed()+"rpm and power of"+getPower()+"dragon power");
    }

    public void holySpirit(){
        System.out.println("This beyblade does not have any holy spirit ");
    }

    public void showInformation(){
        System.out.println("The name of the beyblade owner" + this.name);
        System.out.println("Turning speed in rpm"+ this.turningSpeed);
        System.out.println("Power of the beyblade is"+ this.power +"dragon power" );
        System.out.println("The namde of the beyblade is");

    }



}
