package es.iesnervion.diana.nbaroom.Interfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Entities.Jugador;

@Dao
public interface EquipoDao {

    //Inserción
    @Insert
    public void insertEquipo(Equipo equipos);

    //Actualización
    @Update
    public void updateEquipo(Equipo equipos);

    //Borrado
    @Delete
    public void deleteEquipo(Equipo equipos);

    //Consultas
    @Query("SELECT * FROM Equipos") //Equipo es el nombre establecido en "tableName" como el nombre de la table en la base de datos, en la clase de la entidad, y es necesario
    public ArrayList<Equipo> listaEquipos();

    @Query("SELECT * FROM Equipos WHERE idEquipo = :id LIMIT 1") //Limita el número de filas obtenidas a 1
    public Equipo getEquipoBD(int id);
}
