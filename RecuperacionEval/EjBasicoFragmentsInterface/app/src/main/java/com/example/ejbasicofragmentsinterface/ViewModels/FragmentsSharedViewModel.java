package com.example.ejbasicofragmentsinterface.ViewModels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragmentsSharedViewModel extends ViewModel {

    private MutableLiveData<String> textoAMostrar;
//    private MutableLiveData<Integer> botonSeleccionado; /*Lo usé probando, pero en realidad el elemento de la vista es el texto a mostrar
//                                                          por lo que es el elemento que debería tener el ViewModel*/


    public FragmentsSharedViewModel() {
        this.textoAMostrar = new MutableLiveData<>();
//        this.botonSeleccionado = new MutableLiveData<>();
    }

    public MutableLiveData<String> getTextoAMostrar() {
        return textoAMostrar;
    }

    public void setTextoAMostrar(String textoAMostrar) {
        this.textoAMostrar.setValue(textoAMostrar);
    }


//    public LiveData<Integer> getBotonSeleccionado() {
//        return botonSeleccionado;
//    }
//
//    public void setBotonSeleccionado(int idBoton) {
//        this.botonSeleccionado.setValue(idBoton);
//    }


}
