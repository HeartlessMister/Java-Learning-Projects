package com.company;

public class Account {

    private String kullanici_adi;
    private String parola;
    private double bakiye;

    public Account(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }


    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
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

