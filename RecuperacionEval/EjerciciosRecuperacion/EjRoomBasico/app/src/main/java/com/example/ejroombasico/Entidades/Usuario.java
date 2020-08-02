package com.example.ejroombasico.Entidades;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.UUID;

@Entity
public class Usuario {

    //Atributos privados
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int idUsuario;
    @ColumnInfo(name = "nombreUsuario")
    private String nombreUsuario;
    @ColumnInfo(name = "edadUsuario")
    private int edadUsuario;

    //Constructor

    //Por defecto
    public Usuario() {
//        this.idUsuario = UUID.randomUUID().toString();
        this.idUsuario = 0;
        this.nombreUsuario = "Default";
        this.edadUsuario = 0;
    }
    //Por parámetros
    public Usuario(int idUsuario, String nombreUsuario, int edadUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.edadUsuario = edadUsuario;
    }

    //Getters and Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }
}
