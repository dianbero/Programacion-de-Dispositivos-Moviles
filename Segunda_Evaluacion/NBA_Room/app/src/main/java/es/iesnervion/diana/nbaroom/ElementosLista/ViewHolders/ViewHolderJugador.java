package es.iesnervion.diana.nbaroom.ElementosLista.ViewHolders;

import android.widget.TextView;

public class ViewHolderJugador {

    private TextView nombre;
    private TextView posicion;

    public ViewHolderJugador(TextView nombre, TextView posicion){

        this.nombre = nombre;
        this.posicion = posicion;
    }

    //Getters and Setters

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getPosicion() {
        return posicion;
    }

    public void setPosicion(TextView posicion) {
        this.posicion = posicion;
    }
}
