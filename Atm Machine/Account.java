package com.company;

public class Account {

    private String userName;
    private String parola;
    private double bakiye;

    public Account(String userName, String parola, int bakiye) {
        this.kullanici_adi = userName;
        this.parola = parola;
        this.bakiye = bakiye;
    }


    public String getuserName() {
        return userName;
    }

    public void setKullanici_adi(String userName) {
        this.kullanici_adi = userName;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public void paraYatirma(double tutar) {
        this.bakiye += tutar;
        System.out.println("Yeni Bakiye"+ this.bakiye);
    }

    public void paraCekme(double tutar) {
        if (this.bakiye < tutar) {
            System.out.println("Yetersiz Bakiye");
        } else {
            this.bakiye -= tutar;
            System.out.println("Yeni Bakiye" + this.bakiye);
        }
    }
}

