package com.company;

import java.util.ArrayList;

public class Singers {

    private ArrayList<String> singerList = new ArrayList<String>();


    public void printSingerList(){

        System.out.println("In singer list"+ singerList.size()+"singer exist.");

        for (int i = 0; i <singerList.size(); i ++){

            System.out.println((i+1) +". song: "+ singerList.get(i));


        }
    }

    public void addSinger(String name){
        singerList.add(name);
        System.out.println("Singer name is added to the singer list");
    }

    public void updateSingerList(String name, int position){

        singerList.set(position, name);
        System.out.println("Singer list is updated.");
    }

    public void removeSinger(String name){
        singerList.remove(name);
        System.out.println(name+"is removed from the list.");
    }

    public void removeSinger(int position){
        String name = singerList.get(position);
        singerList.remove(position);
        System.out.println(name+"is removed from the list.");
    }

    public void searchSinger(String name){
        int pozition = singerList.indexOf(name);

        if (pozition>= 0) {

            System.out.println("Singer is founded in the list!");
            System.out.println("Singers name and position"+name+","+ pozition);
        } else {
            System.out.println("Singer is not on the list!");

        }


    }

}
