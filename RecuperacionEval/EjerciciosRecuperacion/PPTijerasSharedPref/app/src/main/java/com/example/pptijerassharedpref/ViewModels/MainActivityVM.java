package com.example.pptijerassharedpref.ViewModels;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityVM extends AndroidViewModel {
    private int ptoPiedra;
    private int ptoPapel;
    private int ptoTijeras;
//    private MutableLiveData<String> textoResultado;
    private String textoResultado;

    public MainActivityVM(@NonNull Application application) {
        super(application);
        //Obtiene los datos guardados en el móvil desde SharedPreference
        SharedPreferences sharedPreferences = application.getSharedPreferences("archivo", Context.MODE_PRIVATE);
        ptoPiedra = sharedPreferences.getInt("ptoPiedra",0);
        ptoPapel = sharedPreferences.getInt("ptoPapel",0);
        ptoTijeras = sharedPreferences.getInt("ptoTijeras",0);
    }

//    public MainActivityVM(@NonNull Application application) {
//        super(application);
//    }

    //Getters ans Setters
    public int getPtoPiedra() {
        return ptoPiedra;
    }

    public void setPtoPiedra(int ptoPiedra) {
        this.ptoPiedra = ptoPiedra;
    }

    public int getPtoPapel() {
        return ptoPapel;
    }

    public void setPtoPapel(int ptoPapel) {
        this.ptoPapel = ptoPapel;
    }

    public int getPtoTijeras() {
        return ptoTijeras;
    }

    public void setPtoTijeras(int ptoTijeras) {
        this.ptoTijeras = ptoTijeras;
    }

    public String getTextoResultado() {
        return textoResultado;
    }

    public void setTextoResultado(String textoResultado) {
//        this.textoResultado.setValue(textoResultado);
        this.textoResultado = textoResultado;
    }
}
