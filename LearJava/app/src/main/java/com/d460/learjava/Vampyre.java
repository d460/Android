package com.d460.learjava;

/**
 * Created by Dagoberto on 18/09/2016.
 */

public class Vampyre extends Enemy {

    public Vampyre(String name) {
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        super.takeDamage(damageDone);
    }

}
