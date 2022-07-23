package com.company;

public class Dragon extends Beyblade{

    private String holySpirit;
    private String hiddenAbility;

    public Dragon(String name, int turningSpeed, int power, String holySpirit, String hiddenAbility) {
        super(name, turningSpeed, power);
        this.holySpirit = holySpirit;
        this.hiddenAbility = hiddenAbility;

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
        System.out.println(getName()+"'s special attack is: Dragon Breath");
        System.out.println("Hidden ability: "+hiddenAbility);
    }

    @Override
    public void showInformation() {
        System.out.println(getName()+"'s holy spirit name is" + holySpirit);
        System.out.println(getName()+"'s special attack is: Dragon Breath");
        System.out.println("Hidden ability: "+hiddenAbility);
    }
}
