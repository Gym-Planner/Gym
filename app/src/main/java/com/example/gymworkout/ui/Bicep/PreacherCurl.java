package com.example.gymworkout.ui.Bicep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.gymworkout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PreacherCurl} factory method to
 * create an instance of this fragment.
 */
public class PreacherCurl extends Fragment {

    public PreacherCurl() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_preacher_curl, container, false);
    }
}