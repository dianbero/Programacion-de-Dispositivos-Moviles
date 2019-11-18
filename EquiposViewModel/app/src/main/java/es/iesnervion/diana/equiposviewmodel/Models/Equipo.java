package es.iesnervion.diana.equiposviewmodel.Models;

import android.graphics.drawable.Drawable;

public class Equipo {
    //Atributos
    private String nombreEquipo;
    private int imagenEquipo;

    //Constructor
    public Equipo(String nombreEquipo, int imagenEquipo){
        this.nombreEquipo = nombreEquipo;
        this.imagenEquipo = imagenEquipo;
    }

    //Getters and Setters
    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public int getImagenEquipo() {
        return imagenEquipo;
    }

    public void setImagenEquipo(int imagenEquipo) {
        this.imagenEquipo = imagenEquipo;
    }
}
