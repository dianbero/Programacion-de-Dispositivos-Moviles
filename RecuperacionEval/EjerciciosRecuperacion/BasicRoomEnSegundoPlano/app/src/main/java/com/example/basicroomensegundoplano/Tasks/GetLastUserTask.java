package com.example.basicroomensegundoplano.Tasks;

import android.os.AsyncTask;

import com.example.basicroomensegundoplano.Dao.UserDao;
import com.example.basicroomensegundoplano.Entities.User;

/**
 * Esta clase no se llega a usar, porque Room me devuelve un LiveData en segundo plano sirectamente
 * por lo que no hace falta implementarlo a mano la operación en segundo plano *
 */
public class GetLastUserTask extends AsyncTask<Void, Void, User> {

    //Private attributes
    private UserDao userDao;

    //Cosntructor
    public GetLastUserTask(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * Método que obtiene el último usuario insertado en la DB en segundo plano
     * @param voids porque no recibe ningún parámetro
     * @return lastUser, el último usuario introducido que obtiene de la DB
     */
    @Override
    protected User doInBackground(Void... voids) {
        //TODO en principio creo que no necesito este método porque al usar un LiveData
        // ya me realiza la operación de acceso a la base de datos en segundo plano
        User lastUser = null; // userDao.getLastUser();
        return lastUser;
    }
}
