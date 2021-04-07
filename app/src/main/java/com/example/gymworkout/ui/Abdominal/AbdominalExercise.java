package com.example.gymworkout.ui.Abdominal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.gymworkout.R;

public class AbdominalExercise extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AbdominalExerciseView abdominalExerciseView = new ViewModelProvider(this).get(AbdominalExerciseView.class);
        View root = inflater.inflate(R.layout.fragment_abdominal, container, false);
        /*final TextView textView = root.findViewById(R.id.text_abd);
        abdominalExerciseView.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });*/
        return root;
    }
}