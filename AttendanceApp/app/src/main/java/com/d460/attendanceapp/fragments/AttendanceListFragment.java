package com.d460.attendanceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.d460.attendanceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AttendanceListFragment extends Fragment {


    public AttendanceListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attendance_list, container, false);
    }

}
