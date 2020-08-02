package com.example.basicroomensegundoplano.Entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    //Private atributes
    @PrimaryKey(autoGenerate = true)
    @NonNull //No sé si esto al ser Primary Key es redundante
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "age")
    private int age;

    //Constructor
    public User(String name, int age) {
//        this.id = id; //Tengo puesto que el id sea autogenerado, porque lo que no es un dato a pasar al crear un nuevo objeto
        this.name = name;
        this.age = age;
    }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
