package com.example.ejercicioelegirfotosintent.Models;

import java.io.Serializable;

public class Persona implements Serializable {
    //Atributos privados
    private String nombre;
    private int imagen;

    //Constructor

    public Persona() {
        this.nombre = "";
        this.imagen = 0;
    }
    public Persona(String nombre, int imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }
    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
