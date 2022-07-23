package com.company;

public class Drayga extends Beyblade{

    private String holySpirit;

    public Drayga(String name, int turningSpeed, int power, String holySpirit) {
        super(name, turningSpeed, power);
        this.holySpirit = holySpirit;
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
        System.out.println(getName()+"'s special attack is: Tiger Claw");
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println(getName()+"'s holy spirit name is" + holySpirit);
        System.out.println(getName()+"'s special attack is: Tiger Claw");
    }
}
