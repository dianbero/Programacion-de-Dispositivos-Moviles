package com.example.ejexamenatletas.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.ejexamenatletas.ApiRepository.ApiDbRepository;
import com.example.ejexamenatletas.Entities.Athlete;

import java.util.ArrayList;
import java.util.List;

public class MainActivityVM extends AndroidViewModel {

    //Private attributes
    private LiveData<List<Athlete>> athleteList;
    private MutableLiveData<Boolean> isTablet;
    private MutableLiveData<Integer> elementPosition;

    //Datos para el manejo de fragments
    private MutableLiveData<String> selectedBotomName;

    private ApiDbRepository repository;

    //Constructors
    public MainActivityVM(@NonNull Application application) {
        super(application);
        //Repository
        this.repository = new ApiDbRepository(application);
        //List of athletes from DB using Repository
        this.athleteList = repository.getAllAthletes();
        this.selectedBotomName = new MutableLiveData<>();
        this.isTablet = new MutableLiveData<>();
        this.elementPosition = new MutableLiveData<>();
    }

    //Getters and Setters

    public LiveData<List<Athlete>> getAthleteList() {
        return athleteList;
    }

    public LiveData<Boolean> isTablet() {
        return isTablet;
    }

    public void setTablet(boolean tablet) {
        this.isTablet.setValue(tablet);
    }


    public LiveData<String> getSelectedBotomName() {
        return selectedBotomName;
    }

    public void setSelectedBotomName(String selectedBotomName) {
        this.selectedBotomName.setValue(selectedBotomName);
    }

    public LiveData<Integer> getElementPosition() {
        return elementPosition;
    }

    public void setElementPosition(int elementPosition) {
        this.elementPosition.setValue(elementPosition);
    }
}
