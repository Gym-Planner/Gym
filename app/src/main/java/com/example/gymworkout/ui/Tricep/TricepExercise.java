package com.example.gymworkout.ui.Tricep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gymworkout.R;

public class TricepExercise extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TricepExerciseView tricepExerciseView = new ViewModelProvider(this).get(TricepExerciseView.class);
        View root = inflater.inflate(R.layout.fragment_tricep, container, false);
        /*final TextView textView = root.findViewById(R.id.text_slideshow);
        tricepExerciseView.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}