package com.company;

public class Dranza extends Beyblade {

    private String holySpirit;


    public Dranza(String name, int turningSpeed, int power, String holyspirit) {
        super(name, turningSpeed, power);
        this.holySpirit = holyspirit;
    }

    public String getHolySpirit() {
        return holySpirit;
    }

    public void setHolySpirit(String holySpirit) {
        this.holySpirit = holySpirit;
    }

    @Override
    public void holySpirit() {
        System.out.println(getName()+"'s" + holySpirit +"is coming to the BATTLE ARENA!");
        System.out.println(getName()+"'s special attack is: Flame Sword!");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println(getName()+"'s holy spirit name is" + holySpirit);
        System.out.println(getName()+"'s special attack is: Flame Sword!");
    }

}

