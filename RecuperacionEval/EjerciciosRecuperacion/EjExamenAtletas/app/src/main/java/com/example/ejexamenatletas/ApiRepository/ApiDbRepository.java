package com.example.ejexamenatletas.ApiRepository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.ejexamenatletas.DataBase.AppDataBase.AppDataBase;
import com.example.ejexamenatletas.DataBase.Dao.AthleteDao;
import com.example.ejexamenatletas.Entities.Athlete;
import com.example.ejexamenatletas.Tasks.InsertAthleteTask;

import java.util.ArrayList;
import java.util.List;

public class ApiDbRepository {
    //Private Attributes

    private AthleteDao athleteDao;
    private Application application;
    private LiveData<List<Athlete>> allAthletes;

    //Constructor

    public ApiDbRepository(Application application) {
        AppDataBase db = AppDataBase.getInstanceDb(application);
        this.athleteDao = db.athleteDao();
        this.application = application;
//        this.allAthletes = athleteDao.getAllAthletes(); //Voy a probar a no hacerlo así para que no
                                                            // haga el esfuerzo en cargar todos los atletas nada más instanciar la clase, sino que
                                                            // lo tenga que hacer cuando lo necesite y llame expresamente al método
    }

    //Methods
    public void insertAthlete(Athlete athlete) {
        new InsertAthleteTask(athleteDao, application).execute(athlete);
//        athleteDao.insertAthlete(athlete);
    }

    public LiveData<List<Athlete>> getAllAthletes() {
        return athleteDao.getAllAthletes();
//        return allAthletes;
    }
}
