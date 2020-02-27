package es.iesnervion.diana.nowroom.RoomDB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.iesnervion.diana.nowroom.DAOInterfaces.UsuarioDAO;
import es.iesnervion.diana.nowroom.Models.Usuario;

@Database(entities = {Usuario.class}, version = 1)
public abstract class UsuariosDB extends RoomDatabase {
    private static UsuariosDB INSTANCE;

    public abstract UsuarioDAO usuario();

    public static UsuariosDB getUsuariosDB(Context context){
        if (INSTANCE==null){
            INSTANCE = Room.databaseBuilder((context.getApplicationContext(), UsuariosDB.class, ))
        }
    }

}
