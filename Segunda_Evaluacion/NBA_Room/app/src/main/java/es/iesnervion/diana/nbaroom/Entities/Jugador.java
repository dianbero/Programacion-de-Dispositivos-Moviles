package es.iesnervion.diana.nbaroom.Entities;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity( tableName = "Jugadores", foreignKeys = @ForeignKey(entity = Equipo.class, parentColumns = "idEquipo", childColumns = "idEquipo"), indices = {@Index("idEquipo")})
public class Jugador {

    //Atributos Privados
    private int idEquipo;
    @PrimaryKey
    private int idJugador;
    private String nombre;
    private int posicion;

    public Jugador(){

    }

    @Ignore //Para que no cree entidades de persistencia de este constructor, que lo necesito para las listas
    public Jugador(String nombre, int posicion) {
        this.nombre = nombre;
        this.posicion = posicion;
    }

    @Ignore
    public Jugador(int idEquipo, String nombre, int posicion) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.posicion = posicion;
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

    public void setIdEquipo(int idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}
