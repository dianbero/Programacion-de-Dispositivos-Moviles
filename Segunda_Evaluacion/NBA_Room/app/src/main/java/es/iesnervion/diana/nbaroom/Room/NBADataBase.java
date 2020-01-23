package es.iesnervion.diana.nbaroom.Room;

import android.content.Context;

import androidx.room.Database;

import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Entities.Jugador;
import es.iesnervion.diana.nbaroom.Interfaces.EquipoDao;

@Database(entities = {Equipo.class, Jugador.class}, version = 1)
public abstract class NBADataBase /*extends RoomDatabase*/{
    public abstract EquipoDao equipoDao();
    private  static NBADataBase INSTANCE;

    static NBADataBase getDataBase(final Context context){
        if (INSTANCE == null){

        }
        return INSTANCE; //Por poner algo para que no me muestre error
    }


}
