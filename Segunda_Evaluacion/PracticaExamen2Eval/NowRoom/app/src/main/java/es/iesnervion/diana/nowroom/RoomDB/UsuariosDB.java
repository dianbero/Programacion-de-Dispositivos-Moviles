package es.iesnervion.diana.nowroom.RoomDB;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.iesnervion.diana.nowroom.DAOInterfaces.UsuarioDAO;
import es.iesnervion.diana.nowroom.Models.Usuario;

@Database(entities = {Usuario.class}, version = 1)
public abstract class UsuariosDB extends RoomDatabase {

    //Declarando la variable "volatile" obliga JVM a usar los valores de la mamoria proncipal y no de la caché
    private static volatile UsuariosDB INSTANCE;

    private static final String DB_NAME = "Usuarios";

    public abstract UsuarioDAO usuario();

    public static synchronized UsuariosDB getUsuariosDB(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    UsuariosDB.class,
                    DB_NAME)
                    .fallbackToDestructiveMigration().build();
        }
        return INSTANCE;
    }

//    public abstract UsuarioDAO usuarioDAO();

}
