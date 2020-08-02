package com.example.ejexamenatletas.Tasks;

import android.app.Application;
import android.os.AsyncTask;

import com.example.ejexamenatletas.Entities.Athlete;

public class InsertAthleteTask extends AsyncTask<Athlete, Void,Void> {

    private Application application;

    public InsertAthleteTask(Application application) {
        this.application = application;
    }

    @Override
    protected Void doInBackground(Athlete... athletes) {
        return null;
    }
}
