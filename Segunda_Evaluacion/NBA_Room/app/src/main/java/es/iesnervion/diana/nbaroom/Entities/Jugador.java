package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Jugadores", foreignKeys = @ForeignKey(entity = Equipo.class, parentColumns = "idEquipo", childColumns = "idEquipo"))
public class Jugador {

    private int idEquipo;
    @PrimaryKey
    private int idJugador;
    private String nombre;
    private String posicion;
    private int dorsal;

    public Jugador(int idEquipo, String nombre, String posicion, int dorsal) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    public int getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(int idJugador) {
        this.idJugador = idJugador;
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
