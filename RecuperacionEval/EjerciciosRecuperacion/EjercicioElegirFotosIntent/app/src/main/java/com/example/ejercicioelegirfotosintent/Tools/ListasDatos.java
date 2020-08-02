package com.example.ejercicioelegirfotosintent.Tools;

import com.example.ejercicioelegirfotosintent.Models.Persona;
import com.example.ejercicioelegirfotosintent.R;

import java.util.ArrayList;
import java.util.List;

public class ListasDatos {

    /**
     * Método que obtiene la lista con los datos de todas las personas
     * @return
     */
    public ArrayList<Persona> getListaPersonas() {
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Pato Donald", R.drawable.default_user));
        listaPersonas.add(new Persona("Pumba", R.drawable.default_user));
        listaPersonas.add(new Persona("Timon", R.drawable.default_user));
        listaPersonas.add(new Persona("Simba", R.drawable.default_user));
        listaPersonas.add(new Persona("Mickey Mouse", R.drawable.default_user));
        listaPersonas.add(new Persona("Campanilla", R.drawable.default_user));
        listaPersonas.add(new Persona("Peter Pan", R.drawable.default_user));
        listaPersonas.add(new Persona("Ariel", R.drawable.default_user));
        listaPersonas.add(new Persona("Cenicienta", R.drawable.default_user));
        listaPersonas.add(new Persona("Wendy", R.drawable.default_user));
        listaPersonas.add(new Persona("Shrek", R.drawable.default_user));
        listaPersonas.add(new Persona("Fiona", R.drawable.default_user));
        listaPersonas.add(new Persona("Capitán Garfio", R.drawable.default_user));
        listaPersonas.add(new Persona("Esmeralda", R.drawable.default_user));
        listaPersonas.add(new Persona("Pocahontas", R.drawable.default_user));
        listaPersonas.add(new Persona("Elsa", R.drawable.default_user));
        listaPersonas.add(new Persona("Mulán", R.drawable.default_user));
        listaPersonas.add(new Persona("Gato Con botas", R.drawable.default_user));

        return listaPersonas;
    }


    /**
     * Método que obtiene la lista de imágenes a elegir en la segunda vista
     * @return array con las imágenes
     */
    public ArrayList<Integer> getListaImagenes() {

        ArrayList<Integer> listaImagenes = new ArrayList<Integer>();
        listaImagenes.add(R.drawable.pato_donald);
        listaImagenes.add(R.drawable.pumba);
        listaImagenes.add(R.drawable.timon);
        listaImagenes.add(R.drawable.simba);
        listaImagenes.add(R.drawable.mickey_mouse);
        listaImagenes.add(R.drawable.campanilla);

        return listaImagenes;
    }

}
