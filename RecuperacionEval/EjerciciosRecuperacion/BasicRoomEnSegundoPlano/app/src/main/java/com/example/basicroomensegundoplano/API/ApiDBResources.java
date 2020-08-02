package com.example.basicroomensegundoplano.API;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.basicroomensegundoplano.Dao.UserDao;
import com.example.basicroomensegundoplano.DataBase.AppDataBase;
import com.example.basicroomensegundoplano.Entities.User;
import com.example.basicroomensegundoplano.Tasks.GetLastUserTask;
import com.example.basicroomensegundoplano.Tasks.InsertUserTask;

/**
 * Clase que funciona como API, es decir, contiene los recursos y funcionalidades de la aplicación
 * con sus correspondientes llamadas a la BD.
 * En este caso:
 * - Insertar nuevo usuario
 * - Obtener el último usuario insertado para ver sus datos
 */
public class ApiDBResources {

    //Private attributes
    private UserDao userDao;
    private LiveData<User> lastUser;
    private Application application;
    //Constructor

    public ApiDBResources(Application application) {
        //Creo e instancio la base de datos
        AppDataBase db = AppDataBase.getDataBase(application);
        this.userDao = db.userDao();
//        this.lastUser = userDao.getLastUser();
        this.lastUser = userDao.getLastUser();

        this.application = application;
    }

    //Methods

    /**
     * Method that calls the task to insert a new user in the DB
     * @param user new user to insert
     */
    public void insertUser(User user){
        new InsertUserTask(userDao, application).execute(user);
    }

    /**
     * Method that calls the task to get the last user inserted in the DB
     * @return LiveData<User> lastUser, object with the last user data
     */
    public LiveData<User> getLastUser() {
        return lastUser;
    }

}
