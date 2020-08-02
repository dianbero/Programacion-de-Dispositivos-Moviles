package com.example.contar10conviewmodel.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContarHasta10ViewModel extends ViewModel {
    private MutableLiveData<Integer> numero;
    private MutableLiveData<Boolean> botonActivado;

    //    Constructor
    public ContarHasta10ViewModel() {
        this.numero = new MutableLiveData<>();
        this.botonActivado = new MutableLiveData<>();
    }

    //    Getters and Setters
    public LiveData<Integer> getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero.setValue(numero);
    }

    public MutableLiveData<Boolean> getBotonActivado() {
        return botonActivado;
    }

    public void setBotonActivado(boolean botonActivado) {
        this.botonActivado.setValue(botonActivado);
    }
}
