package com.d460.nsizedie;

/**
 * Created by Dagoberto on 22/09/2016.
 */

public class NSizeDice {

    public static void main(String[] args) {

        Die d12 = new Die(12);
        Die normal = new Die(6);
        Die seed12 = new Die(12,10);
        Die seed9 = new Die(9,5);

        System.out.println(d12.getValue());
        System.out.println(d12.getValue());
        System.out.println(seed12.getValue());
        System.out.println(seed9.getValue());

    }

}
