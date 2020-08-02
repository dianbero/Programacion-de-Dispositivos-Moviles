package com.example.pptijerassharedpref.ViewModels;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResultadosActivityVM extends ViewModel {
    private MutableLiveData<Integer> ptosPiedraGanados, ptosPapelGanados, ptosTijerasGanados;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

//    public ResultadosActivityVM(@NonNull Application application) {
//        super(application);
//
//        this.ptosPiedraGanados = new MutableLiveData<>();
////        this.ptosPiedraPerdidos = new MutableLiveData<>();
//        this.ptosPapelGanados = new MutableLiveData<>();
//        this.ptosTijerasGanados = new MutableLiveData<>();
//
//        sharedPreferences = application.getSharedPreferences("archivo", Context.MODE_PRIVATE);
//
//        ptosTijerasGanados.setValue(sharedPreferences.getInt("ptoPiedra", 0));
//        ptosPapelGanados.setValue(sharedPreferences.getInt("ptoPapel", 0));
//        ptosTijerasGanados.setValue(sharedPreferences.getInt("ptoTijeras", 0));
//
//        sharedPreferences.edit();
//
//    }

    public ResultadosActivityVM() {

        this.ptosPiedraGanados = new MutableLiveData<>();
//        this.ptosPiedraPerdidos = new MutableLiveData<>();
        this.ptosPapelGanados = new MutableLiveData<>();
        this.ptosTijerasGanados = new MutableLiveData<>();

    }

    public MutableLiveData<Integer> getPtosPiedraGanados() {
        return ptosPiedraGanados;
    }

    public void setPtosPiedraGanados(int ptosPiedraGanados) {
        this.ptosPiedraGanados.setValue(ptosPiedraGanados);
    }

    public MutableLiveData<Integer> getPtosPapelGanados() {
        return ptosPapelGanados;
    }

    public void setPtosPapelGanados(int ptosPapelGanados) {
        this.ptosPapelGanados.setValue(ptosPapelGanados);
    }

    public MutableLiveData<Integer> getPtosTijerasGanados() {
        return ptosTijerasGanados;
    }

    public void setPtosTijerasGanados(int ptosTijerasGanados) {
        this.ptosTijerasGanados.setValue(ptosTijerasGanados);
    }
}
