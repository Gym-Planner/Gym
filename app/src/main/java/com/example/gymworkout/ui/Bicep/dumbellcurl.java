package com.example.gymworkout.ui.Bicep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.gymworkout.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link dumbellcurl} factory method to
 * create an instance of this fragment.
 */
public class dumbellcurl extends Fragment {
    //public TextView text;

    public dumbellcurl() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_dumbellcurl, container,
                false);
        /*text = (TextView) text.findViewById(R.id.textView2);
        text.setText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        String[] para = text.getText().toString().split("\r\n\r\n");
        Toast.makeText(dumbellcurl.this, "" + para.length, Toast.LENGTH_LONG).show();*/
    }
}