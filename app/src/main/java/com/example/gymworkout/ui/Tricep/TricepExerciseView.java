package com.example.gymworkout.ui.Tricep;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TricepExerciseView extends ViewModel {

    private final MutableLiveData<String> mText;

    public TricepExerciseView() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Tricep fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}