package com.example.ejroombasico.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ejroombasico.Dao.UsuarioDao;
import com.example.ejroombasico.Entidades.Usuario;

@Database(entities = {Usuario.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {


    public abstract UsuarioDao usuarioDao();

    private static AppDataBase INSTANCE;

    public static AppDataBase getDataBase(final Context context) {
        if (INSTANCE == null) {
            synchronized (AppDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDataBase.class, "UsuariosDB")
                            .allowMainThreadQueries() //No debe usarse, porque permite acceder a la BD en el hilo principal, lo que provocaría que la app se parase mientras accede
                            .build();
                }
            }
        }

        return INSTANCE;
    }

}
