package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Jugador {
    @PrimaryKey
    private int idEquipo;
    private String nombre;
    private String posicion;
    private int dorsal;

    public Jugador(int idEquipo, String nombre, String posicion, int dorsal) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public int getIdEquipo() {
        return idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }
}
