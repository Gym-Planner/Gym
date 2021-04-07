package com.example.gymworkout.ui.Abdominal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AbdominalExerciseView extends ViewModel {

    private MutableLiveData<String> mText;

    public AbdominalExerciseView() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Abdominal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}