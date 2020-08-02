package es.iesnervion.diana.exampleroom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import es.iesnervion.diana.exampleroom.Entities.User;
import es.iesnervion.diana.exampleroom.UserDao.UserDao;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase INSTANCE;

    public abstract UserDao userDao();

    public static AppDatabase getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "user-database").
                    //Allow queries on the main thread (Don't do this on a real app)
                    allowMainThreadQueries().build();

        }

        return INSTANCE;
    }

    public static void destroyInstance(){
        INSTANCE = null;
    }

}
