package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "Jugadores", foreignKeys = @ForeignKey(entity = Equipo.class, parentColumns = "idEquipo", childColumns = "idEquipo"))
public class Jugador {

    //Atributos Privados
    private int idEquipo;
    @PrimaryKey
    private int idJugador;
    private String nombre;
    private int posicion;
    private int dorsal;

    @Ignore //Para que no cree entidades de persistencia de este constructor, que lo necesito para las listas
    public Jugador(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public Jugador(int idEquipo, String nombre, int posicion, int dorsal) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.posicion = posicion;
        this.dorsal = dorsal;
    }

    //Getters and Setters
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

    public int getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }
}
