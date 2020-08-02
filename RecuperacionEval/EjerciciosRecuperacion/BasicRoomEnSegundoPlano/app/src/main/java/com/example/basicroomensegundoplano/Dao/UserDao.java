package com.example.basicroomensegundoplano.Dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.basicroomensegundoplano.Entities.User;

@Dao
public interface UserDao {
    //Class with the SQL statements for Room

    @Insert
    void insertUser(User user); //TODO ver qué devuelve si pongo que devuelva int en lugar de void

    @Query("SELECT * FROM User ORDER BY id DESC LIMIT 1;")
    LiveData<User> getLastUser();

    @Query("SELECT * FROM User ORDER BY id DESC LIMIT 1")
    User getLastUserNoLIveData();




}
