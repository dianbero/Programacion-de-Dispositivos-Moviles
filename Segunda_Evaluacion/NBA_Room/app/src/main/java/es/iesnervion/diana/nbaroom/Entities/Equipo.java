package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Equipos") //Necesario para las consultas
public class Equipo {

    @PrimaryKey
    private int idEquipo;
    @Ignore
    private Integer imagen;
    private String nombre;

    public int getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }
    @Ignore
    public Equipo(Integer imagen, String nombre, String conferencia) {
        this.imagen = imagen;
        this.nombre = nombre;
    }
    @Ignore
    public Integer getImagen() {
        return imagen;
    }

}
