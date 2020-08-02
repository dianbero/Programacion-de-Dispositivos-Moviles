package com.example.ejercicioelegirfotosintent.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ejercicioelegirfotosintent.Models.Persona;
import com.example.ejercicioelegirfotosintent.Tools.ListasDatos;

import java.util.ArrayList;

public class MainActivityVM extends ViewModel {
    //Atributos Privados
    private MutableLiveData<ArrayList<Persona>> listaPersonasMutable; // = new MutableLiveData<>();
    private ArrayList<Persona> personas;
    private MutableLiveData<Integer> cambiarPosicionImagen;

    public MainActivityVM() {
    }

    //Método para obtener la lista de personas
    public LiveData<ArrayList<Persona>> getListaPersonasMutable() {
        if (listaPersonasMutable == null) {
            listaPersonasMutable = new MutableLiveData<>();
            personas = new ListasDatos().getListaPersonas();
            listaPersonasMutable.setValue(personas);
        }
        return listaPersonasMutable;
    }

    //Establece el valor del liveData de lista de personas
    public void setListaPersonasLiveData(ArrayList<Persona> listPersonas) {
        this.personas = listPersonas;
        listaPersonasMutable.setValue(personas);
    }

    //Obtiene el valor de la lista normal (sin LiveData) de personas
    public ArrayList<Persona> getListaPersonas() {
        return personas;
    }

    public void setListaPersonas(ArrayList<Persona> listaPersonas) {
        this.personas = listaPersonas;
    }

}
