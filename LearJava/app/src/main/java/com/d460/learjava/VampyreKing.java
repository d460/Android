package com.d460.learjava;

import java.util.Random;

/**
 * Created by Dagoberto on 18/09/2016.
 */

public class VampyreKing extends Vampyre {


    public VampyreKing(String name) {
        super(name);
        this.setHitPoint(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage/2);
    }

    public boolean runAway(){
       return (this.getLives() < 2);
    }

    public boolean dodges (){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if (chance > 3){
            System.out.println("The king Dodges");
            return true;
        } else
        {
            return false;
        }
    }
}
