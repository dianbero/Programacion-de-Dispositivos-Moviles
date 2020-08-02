package com.example.basicroomensegundoplano.ViewModelFactories;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.basicroomensegundoplano.ViewModels.InfoActivityVM;

/**
 * Clase necesaria porque extiendo de AndroidViewmodel, por lo tanto le tengo que pasar
 * argumentos a ViewModelProvider (el application) y para ello necesito usar Factory,
 * que es lo que hago en esta clase, implementar ViewModelProvider.Factory
 */
public class InfoActivityVMFactory implements ViewModelProvider.Factory {

    private Application application;

    public InfoActivityVMFactory(Application application) {
        this.application = application;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass.isAssignableFrom(InfoActivityVM.class)) {
            return (T) new InfoActivityVM(application);
        } else {
            throw new IllegalArgumentException("Viewmodel class not found");
        }

//        return (T) new InfoActivityVM(application);
    }
}
