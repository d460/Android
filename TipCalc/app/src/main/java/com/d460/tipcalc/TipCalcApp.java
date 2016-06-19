package com.d460.tipcalc;

import android.app.Application;

/**
 * Created by Dagoberto on 18/06/2016.
 */
public class TipCalcApp extends Application{

    private final static String ABOUT_URL = "https://about.me/dagovf";

    public String getAboutUrl() {
        return ABOUT_URL;
    }
}
