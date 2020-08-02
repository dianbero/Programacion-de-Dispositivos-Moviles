package com.example.ejexamenatletas.Tasks;

import android.app.Application;
import android.os.AsyncTask;

public class GetAllAthletesTask extends AsyncTask<Void, Void,Void> {

    private Application application;

    public GetAllAthletesTask(Application application) {
        this.application = application;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }
}

