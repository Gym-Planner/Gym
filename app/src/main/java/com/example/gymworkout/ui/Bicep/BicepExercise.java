package com.example.gymworkout.ui.Bicep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.gymworkout.R;

public class BicepExercise extends Fragment implements View.OnClickListener {

    public BicepExercise(){

    }

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        //BicepExerciseView bicepExerciseView = new ViewModelProvider(this).get(BicepExerciseView.class);
        View root = inflater.inflate(R.layout.fragment_bicep, container, false);
        ImageButton purple=(ImageButton) root.findViewById(R.id.dumbellcurlbtn);
        purple.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                //how to go to tasks fragment from here???
                /*Fragment fragment = new dumbellcurl();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.action_nav_bicep_to_dumbellcurl, fragment, "findThisFragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_dumbellcurl);
            }
        });
        ImageButton purple1=(ImageButton) root.findViewById(R.id.concentrationbtn);
        purple1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                //how to go to tasks fragment from here???
                /*Fragment fragment = new dumbellcurl();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.action_nav_bicep_to_dumbellcurl, fragment, "findThisFragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_concentration);
            }
        });
        ImageButton purple2=(ImageButton) root.findViewById(R.id.hammercurlbtn);
        purple2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                //how to go to tasks fragment from here???
                /*Fragment fragment = new dumbellcurl();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.action_nav_bicep_to_dumbellcurl, fragment, "findThisFragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_hammercurl);
            }
        });
        ImageButton purple3=(ImageButton) root.findViewById(R.id.preacherbtn);
        purple3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                //how to go to tasks fragment from here???
                /*Fragment fragment = new dumbellcurl();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.action_nav_bicep_to_dumbellcurl, fragment, "findThisFragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_preacher);
            }
        });
        ImageButton purple4=(ImageButton) root.findViewById(R.id.seatedcurlbtn);
        purple4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                //how to go to tasks fragment from here???
                /*Fragment fragment = new dumbellcurl();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.action_nav_bicep_to_dumbellcurl, fragment, "findThisFragment");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();*/
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_seatedcurl);
            }
        });
        ImageButton purple5=(ImageButton) root.findViewById(R.id.reversecurlbtn);
        purple5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_reversecurl);
            }
        });
        ImageButton purple6=(ImageButton) root.findViewById(R.id.highcurlbtn);
        purple6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_highcurl);
            }
        });
        ImageButton purple7=(ImageButton) root.findViewById(R.id.preacherhammbtn);
        purple7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View root) {
                // TODO Auto-generated method stub
                NavHostFragment.findNavController(BicepExercise.this)
                        .navigate(R.id.action_nav_bicep_to_preacherhammer);
            }
        });
        return root;
    }
    @Override
    public void onClick(View v) {

    }
}

