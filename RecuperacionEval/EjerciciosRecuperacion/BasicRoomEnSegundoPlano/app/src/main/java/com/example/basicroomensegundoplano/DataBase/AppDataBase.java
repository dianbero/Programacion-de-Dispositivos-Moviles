package com.example.basicroomensegundoplano.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.basicroomensegundoplano.Dao.UserDao;
import com.example.basicroomensegundoplano.Entities.User;

@Database(entities = {User.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract UserDao userDao();

    private static AppDataBase INSTANCE_DB;

    public static synchronized AppDataBase getDataBase(Context context) {
        if (INSTANCE_DB == null) {
            INSTANCE_DB = Room.databaseBuilder(context.getApplicationContext(),
                    AppDataBase.class, "UsersDB")
                    .fallbackToDestructiveMigration() //Para evitar problemas con la versión al hacer
                                                    // cambios, pero no debe hacerse realmente, lo datos de borrarían de la BBDD,
                                                    // porque vuelve a crearse desde cero
                    //.allowMainThreadQueries() //Está comentado porque esto no debe usarse, es sólo para pruebas, mientras no se tenga preparado en segundo plano, etc
                    .build();
        }

        return INSTANCE_DB;
    }


}
