package com.d460.tipcalc.fragments;

import com.d460.tipcalc.models.TipRecord;

/**
 * Created by Dagoberto on 19/06/2016.
 */
public interface TipHistoryListFragmentListener {

    void addToList(TipRecord record);
    void clearList();

}
