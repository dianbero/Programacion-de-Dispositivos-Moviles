package com.example.ejexamenatletas.DataBase.AppDataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.ejexamenatletas.DataBase.Dao.AthleteDao;
import com.example.ejexamenatletas.Entities.Athlete;

@Database(entities = {Athlete.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {

    public abstract AthleteDao athleteDao();

    private static AppDataBase INSTANCE_DB;

    public static synchronized AppDataBase getInstanceDb(Context context) {
        if (INSTANCE_DB == null) {
            INSTANCE_DB= Room.databaseBuilder(context.getApplicationContext(),
                    AppDataBase.class, "AthletesDB")
                    .fallbackToDestructiveMigration() //To not have problems with the version changes
                    .build();
        }

        return  INSTANCE_DB;
    }
}
