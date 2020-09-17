package com.example.simpleretrofitlist.ViewModels.FactoryVM;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.simpleretrofitlist.ViewModels.MainActivityVM;

public class FactoryVM implements ViewModelProvider.Factory {

    private Application application;

    public FactoryVM(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(MainActivityVM.class)) {
            return (T) new MainActivityVM(application);
        }else {
            throw new IllegalArgumentException("ViewModel class not found");
        }
    }
}
