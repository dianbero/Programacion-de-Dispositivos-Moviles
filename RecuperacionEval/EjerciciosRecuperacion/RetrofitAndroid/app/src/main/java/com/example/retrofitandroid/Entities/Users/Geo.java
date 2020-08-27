package com.example.retrofitandroid.Entities.Users;

public class Geo {

    //Private Attributes
    private String lat;
    private String lng;

    //Constructor
    public Geo(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    //Getters and Setters

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
