package edu.unl.raikes.day05;

import java.util.Arrays;

public class ZombieInvasion {

    public static void main(String[] args) {
        // identify the towns near us
        Town kauffman = new Town("Kauffman", "Stephen Cooper", 0, 0);
        Town launduras = new Town("Launduras", "Ty DePods", -6, -4);
        
        Town[] towns = {kauffman, launduras};
        
        
        System.out.println(kauffman);
        System.out.println(launduras);
        
        
        // we elected a new mayor
        kauffman.setMayor("Stephanie Valentine");

        System.out.println("Kauffman elected a new mayor: " + kauffman.getMayor());
        

        int whoIsBetter = kauffman.compareTo(launduras);
        
        
        if(whoIsBetter > 0) {
            System.out.println("Kauffman rocks!");
        }
        else {
            System.out.println("boooooo");
        }

        System.out.println(Arrays.toString(towns));
        Arrays.sort(towns);
        System.out.println(Arrays.toString(towns));
        // identify how far away those towns are
        // warn the towns of how long it will take for zombies to reach them
    }

}
