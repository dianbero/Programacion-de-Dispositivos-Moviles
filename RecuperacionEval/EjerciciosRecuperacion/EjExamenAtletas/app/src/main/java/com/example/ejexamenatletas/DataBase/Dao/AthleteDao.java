package com.example.ejexamenatletas.DataBase.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ejexamenatletas.Entities.Athlete;

import java.util.ArrayList;
import java.util.List;

@Dao
public interface AthleteDao {

    @Insert
    void insertAthlete(Athlete athlete);

    @Query("SELECT * FROM Athlete")
    LiveData<List<Athlete>> getAllAthletes();


}
