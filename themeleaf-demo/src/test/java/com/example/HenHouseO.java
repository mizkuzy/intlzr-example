package com.example;

import java.util.ArrayList;
import java.util.List;

class Chicken {}

interface HenHouse { public java.util.List<Chicken> getChickens(); }

public class HenHouseO implements HenHouse{
    @Override
    public List<Chicken> getChickens() {
        ArrayList<Chicken> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Chicken());
        }
        return new ArrayList<Chicken>();
    }
}

class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new HenHouseO();
        //Chicken chicken = house.getChickens().get(0);
        Chicken chicken;
        for(int i=0; i<house.getChickens().size();
            chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
    }}
}