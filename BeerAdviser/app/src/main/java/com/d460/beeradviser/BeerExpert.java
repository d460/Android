package com.d460.beeradviser;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dagoberto on 19/12/2015.
 */

public class BeerExpert {
    List<String> getBrands(String color){

        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else if (color.equals("brown")){
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        else {
            brands.add("Modelo");
            brands.add("Corona");
        }
        return brands;
    }
}
