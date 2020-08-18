package com.example.ejexamenatletas.Tasks;

import android.app.Application;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.ejexamenatletas.DataBase.Dao.AthleteDao;
import com.example.ejexamenatletas.Entities.Athlete;

public class InsertAthleteTask extends AsyncTask<Athlete, Void,Void> {

    private AthleteDao athleteDao;
    private Application application;

    public InsertAthleteTask(AthleteDao athleteDao, Application application) {
        this.athleteDao = athleteDao;
        this.application = application;
    }


    @Override
    protected Void doInBackground(Athlete... athletes) {
        athleteDao.insertAthlete(athletes[0]);
        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Toast.makeText(application, "Athlete inserted", Toast.LENGTH_SHORT).show();
    }
}
