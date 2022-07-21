package com.company;


public class Main {

    public static void main(String[] args) {

        Atm atm = new Atm();

        Account yunus = new Account("Yunus","123yunus123", 10000);

        atm.work(yunus);

        System.out.println("Programdan Cikiliyor...");


    }

}

