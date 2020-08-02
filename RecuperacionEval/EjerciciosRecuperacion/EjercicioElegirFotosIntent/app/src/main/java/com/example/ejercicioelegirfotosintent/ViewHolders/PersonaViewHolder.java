package com.example.ejercicioelegirfotosintent.ViewHolders;

import android.widget.ImageView;
import android.widget.TextView;

public class PersonaViewHolder {
    //Atributos
    private TextView texto;
    private ImageView vistaImagen;
    //Constructor

    public PersonaViewHolder(TextView texto, ImageView vistaImagen) {
        this.texto = texto;
        this.vistaImagen = vistaImagen;
    }

    //Getters and Setters
    public TextView getTexto() {
        return texto;
    }

    public void setTexto(TextView texto) {
        this.texto = texto;
    }

    public ImageView getVistaImagen() {
        return vistaImagen;
    }

    public void setVistaImagen(ImageView vistaImagen) {
        this.vistaImagen = vistaImagen;
    }
}
