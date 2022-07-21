package com.company;

import java.util.Objects;

public class Antrenman {

    private int burpeeNumber;
    private int pushupNumber;
    private int situpNumber;
    private int squadNumber;

    public Antrenman(int burpeeNumber, int pushupNumber, int situpNumber, int squadNumber) {
        this.burpeeNumber = burpeeNumber;
        this.pushupNumber = pushupNumber;
        this.situpNumber = situpNumber;
        this.squadNumber = squadNumber;
    }

    public int getBurpeeNumber() {
        return burpeeNumber;
    }

    public void setBurpeeNumber(int burpeeNumber) {
        this.burpeeNumber = burpeeNumber;
    }

    public int getPushupNumber() {
        return pushupNumber;
    }

    public void setPushupNumber(int pushupNumber) {
        this.pushupNumber = pushupNumber;
    }

    public int getSitupNumber() {
        return situpNumber;
    }

    public void setSitupNumber(int situpNumbe) {
        this.situpNumber = situpNumbe;
    }

    public int getSquadNumber() {
        return squadNumber;
    }

    public void setSquadNumber(int squadNumber) {
        this.squadNumber = squadNumber;
    }

    public void doMovements(String anternmanType, int number) {

        if (anternmanType.equals("Burpee")) {

            doBurpbee(number);

        } else if (anternmanType.equals("Pushup")) {

            doPushup(number);
        } else if (anternmanType.equals("Situp")) {

            doSitup(number);
        } else if (anternmanType.equals("Squad")) {

            doSquad(number);

        } else {
            System.out.println("Unkown Movement");
        }
    }

    public void doBurpbee(int number) {

        if (burpeeNumber == 0) {
            System.out.println("There is no burpee left to do...");
        }
        if (burpeeNumber - number < 0) {
            System.out.println("Congratulations, you exceed the number of burpee required");
            burpeeNumber = 0;
        } else {

            burpeeNumber -= number;
            System.out.println("Remaining number of burpee is" + burpeeNumber);

        }
    }

    public void doPushup(int number) {

        if (pushupNumber == 0) {
            System.out.println("There is no pushup left to do...");
        }
        if (pushupNumber - number < 0) {
            System.out.println("Congratulations, you exceed the number of pushups required");
            pushupNumber = 0;
        } else {

            pushupNumber -= number;
            System.out.println("Remaining number of pushup is" + pushupNumber);

        }
    }

    public void doSitup(int number) {

        if (situpNumber == 0) {
            System.out.println("There is no situp left to do...");
        }
        if (situpNumber - number < 0) {
            System.out.println("Congratulations, you exceed the number of situps required");
            situpNumber = 0;
        } else {

            situpNumber -= number;
            System.out.println("Remaining number of situp is" + situpNumber);

        }
    }

    public void doSquad(int number) {

        if (squadNumber == 0) {
            System.out.println("There is no squad left to do...");
        }
        if (squadNumber - number < 0) {
            System.out.println("Congratulations, you exceed the number of squads required");
            squadNumber = 0;
        } else {

            squadNumber -= number;
            System.out.println("Remaining number of squad is" + squadNumber);

        }


    }

    public boolean anternmanIsFinished(){
        return burpeeNumber == 0 && pushupNumber == 0 && situpNumber == 0 && squadNumber == 0;
    }



}



