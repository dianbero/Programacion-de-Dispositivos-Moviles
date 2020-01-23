package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Insert;
import androidx.room.PrimaryKey;

@Entity(tableName = "Equipos") //Necesario para las consultas
public class Equipo {

    //Atributos privados
    @PrimaryKey
    private int idEquipo;
    @Ignore
    private Integer imagen;
    private String nombre;

    @Ignore
    public Equipo(Integer imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }

    //Getters and Setters
    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Integer getImagen() {
        return imagen;
    }

    public void setImagen(Integer imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
