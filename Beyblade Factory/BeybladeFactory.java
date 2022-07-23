package com.company;

public class BeybladeFactory {

    public Beyblade manufactureBayblade(String beybladeType) {

        if (beybladeType.equals("Dranza")) {

            Beyblade beyblade = new Dranza("Kai", 600, 500,"Red Phoneix");
            return beyblade;


        } else if (beybladeType.equals("Drayga")){
            return new Dranza("Rei", 800, 250,"White Tiger");
        }
        else if (beybladeType.equals("Draciel")){
            return new Drayga("Max", 400, 1000,"Dark Tortoise");
        }
        else if (beybladeType.equals("Dragon")){
            return new Dragon("Takao", 800, 400,"Blue Dragon", "Friendship");
        }
        else {
            return null;
        }
    }
}