package com.example.basicroomensegundoplano.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.basicroomensegundoplano.API.ApiDBResources;
import com.example.basicroomensegundoplano.Entities.User;

/**
 * Esta clase no llego a utilizarla
 */

public class MainActivityVM extends AndroidViewModel {

    private ApiDBResources api;


    public MainActivityVM(@NonNull Application application) {
        super(application);
        this.api = new ApiDBResources(application);
    }

    //Methods
    public void insertUser(User user){
        api.insertUser(user);
    }

}
