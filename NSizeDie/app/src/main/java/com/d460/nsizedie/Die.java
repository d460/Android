package com.d460.nsizedie;

import java.util.Random;

/**
 * Created by Dagoberto on 22/09/2016.
 */

public class Die {


    private int side;
    private int value;
    private Random generator;

    /**
     * Constructor de la clase Die con el parametro side
     * @param side  PArametro side
     */

    public Die(int side) {
        this.side = side;
        this.generator = new Random();
        this.value = this.roll();
    }


    /**
     * Constructor de la clase Die con 2 parametros
     * @param side  Side int
     * @param seed  Seed int
     */

    public Die(int side, int seed) {
        this.side = side;
        this.generator = new Random(seed);
        this.value = this.roll();
    }

    public int roll(){

    this.value = this.generator.nextInt(this.side) + 1;
        return this.value;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getValue() {
        return value;
    }

}
