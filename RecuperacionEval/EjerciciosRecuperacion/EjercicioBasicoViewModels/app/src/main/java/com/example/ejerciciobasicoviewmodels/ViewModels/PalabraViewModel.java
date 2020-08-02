package com.example.ejerciciobasicoviewmodels.ViewModels;

import androidx.lifecycle.ViewModel;

public class PalabraViewModel extends ViewModel {
    private String palabra;

    //No funciona con constructor con parámetros
    public PalabraViewModel() {
        this.palabra = "";
    }

    public PalabraViewModel(String palabra) {
        this.palabra = palabra;
    }


    //Getters and Setters

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
}
