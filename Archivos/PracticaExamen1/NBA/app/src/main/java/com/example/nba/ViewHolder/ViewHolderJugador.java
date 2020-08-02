package com.example.nba.ViewHolder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderJugador {
    private TextView nombre;
    private ImageView dorsal;
    private TextView posicion;

    public ViewHolderJugador(ImageView dorsal, TextView nombre, TextView posicion){
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public TextView getNombre() {
        return nombre;
    }

    public ImageView getDorsal() {
        return dorsal;
    }

    public TextView getPosicion() {
        return posicion;
    }
}
