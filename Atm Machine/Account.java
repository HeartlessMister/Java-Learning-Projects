package com.company;

public class Account {

    private String userName;
    private String password;
    private double balance;

    public Account(String userName, String password, int balance) {
        this.userName = userName;
        this.password = password;
        this.balance = balance;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("New balance: "+ this.balance);
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            this.balance -= amount;
            System.out.println("New balance: " + this.balance);
        }
    }
}

