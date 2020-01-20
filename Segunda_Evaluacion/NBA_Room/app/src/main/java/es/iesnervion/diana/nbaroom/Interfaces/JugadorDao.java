package es.iesnervion.diana.nbaroom.Interfaces;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.Entities.Jugador;
@Dao
public interface JugadorDao {
    //Inserción
    @Insert
    public void insertJugador(Jugador jugadores);

    //Actualización
    @Update
    public void updateJugador(Jugador jugadores);

    //Borrado
    public void deleteJugador(Jugador judarores);

    //Consultas
    @Query("SELECT * FROM jugadores")
    public ArrayList<Jugador> listaJugadores();

    @Query("SELECT * FROM jugadores WHERE idJugador = :id LIMIT 1")
    public Jugador getJugadorBD(int id);
}
