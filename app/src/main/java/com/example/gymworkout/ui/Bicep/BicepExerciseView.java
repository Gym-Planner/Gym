package com.example.gymworkout.ui.Bicep;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BicepExerciseView extends ViewModel {

    private MutableLiveData<String> mText;

    public BicepExerciseView() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Abdominal fragment");
    }
    void doAction() {
        // depending on the action, do necessary business logic calls and update the
        // userLiveData.
    }
    public LiveData<String> getText() {
        return mText;
    }

}