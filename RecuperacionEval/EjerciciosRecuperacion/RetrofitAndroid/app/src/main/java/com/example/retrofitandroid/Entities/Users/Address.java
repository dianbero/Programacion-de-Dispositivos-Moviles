package com.example.retrofitandroid.Entities.Users;

public class Address {

    //Private Attributes
    private String street;
    private String cty;
    private String zipcode;
    private Geo geo;
    //Constructor

    public Address(String street, String cty, String zipcode, Geo geo) {
        this.street = street;
        this.cty = cty;
        this.zipcode = zipcode;
        this.geo = geo;
    }

    //Getters and Setters

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }
}
