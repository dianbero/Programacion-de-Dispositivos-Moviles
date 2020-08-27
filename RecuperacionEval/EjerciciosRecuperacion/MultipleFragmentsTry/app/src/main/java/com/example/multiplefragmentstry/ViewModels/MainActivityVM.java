package com.example.multiplefragmentstry.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityVM extends ViewModel {
    //Private Atributes
    private MutableLiveData<Integer> btnID;
    private MutableLiveData<String> selectedText;
    private MutableLiveData<String> text;

    //Constructor
    public MainActivityVM() {
        this.btnID = new MutableLiveData<>();
        this.selectedText = new MutableLiveData<>();
        this.text = new MutableLiveData<>();
    }

    //Getters ans Setters
    public MutableLiveData<Integer> getBtnID() {
        return btnID;
    }

    public void setBtnID(int btnID) {
        this.btnID.setValue(btnID);
    }

    public MutableLiveData<String> getSelectedText() {
        return selectedText;
    }

    public void setSelectedText(String selectedText) {
        this.selectedText.setValue(selectedText);
    }

    public LiveData<String> getText() {
        return text;
    }

    public void setText(String text) {
        this.text.setValue(text);
    }
}
