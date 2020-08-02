package com.example.basicroomensegundoplano.Tasks;

import android.app.Application;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.basicroomensegundoplano.Dao.UserDao;
import com.example.basicroomensegundoplano.Entities.User;

/**
 * Clase que inserta un nuevo usuario en segundo plano con Asynctask
 */
public class InsertUserTask extends AsyncTask<User, Integer, Void> {

    //Private attributes
    private UserDao userDao;
    private Application application;

    //Constructor
    public InsertUserTask(UserDao userDao, Application application) {
        this.userDao = userDao;
        this.application = application;
    }

    /**
     * Método que inserta un nuevo usuario en segundo plano
     *
     * @param users nuevo usuario a insertar
     * @return null, because it's void
     */
    @Override
    protected Void doInBackground(User... users) {
        for (int i = 1; i > 0; i--) {
            try {
                publishProgress(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Inserta el nuevo usuario
        userDao.insertUser(users[0]);
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        Toast.makeText(application, "Guardando en " + values[0] + " segundos...", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Toast.makeText(application, "Saved already", Toast.LENGTH_SHORT).show();
    }
}
