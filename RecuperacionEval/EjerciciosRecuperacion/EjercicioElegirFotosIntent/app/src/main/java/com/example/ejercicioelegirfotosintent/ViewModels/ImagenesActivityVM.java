package com.example.ejercicioelegirfotosintent.ViewModels;

import android.widget.ArrayAdapter;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.ejercicioelegirfotosintent.Tools.ListasDatos;

import java.util.ArrayList;
import java.util.List;

public class ImagenesActivityVM extends ViewModel {
    //    //Atributos Privados
    private MutableLiveData<ArrayList<Integer>> listaImagenesLiveData;
    private ArrayList<Integer> listaImagenes;

    public ImagenesActivityVM() {
        this.listaImagenes = new ArrayList<>();
    }

    //Métodos

    /**
     * Método que devuelve las imágenes en el LiveData
     *
     * @return
     */
    public LiveData<ArrayList<Integer>> getListaImagenesLiveData() {
        if (listaImagenesLiveData == null) {
            listaImagenesLiveData = new MutableLiveData<>();
            listaImagenes = new ListasDatos().getListaImagenes();
            listaImagenesLiveData.setValue(listaImagenes);
        }
        return listaImagenesLiveData;
    }

    /**
     * Método que cambia la lista de imágenes de liveData
     * @param listaImagenes con los nuevos datos para actualizar
     */
    public void setListaImagenesLiveData(ArrayList<Integer> listaImagenes) {
        this.listaImagenes = listaImagenes;
        listaImagenesLiveData.setValue(listaImagenes);
    }

    public void setListaImagenes(ArrayList<Integer> imagenes) {
        this.listaImagenes = imagenes;
    }

    public ArrayList<Integer> getListaImagenes() {
        return listaImagenes;
    }


}
