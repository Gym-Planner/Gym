package com.example.gymworkout.ui.Bicep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.gymworkout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PreacherHammerCurl} factory method to
 * create an instance of this fragment.
 */
public class PreacherHammerCurl extends Fragment {

    public PreacherHammerCurl() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_preacher_hammer_curl, container, false);
    }
}