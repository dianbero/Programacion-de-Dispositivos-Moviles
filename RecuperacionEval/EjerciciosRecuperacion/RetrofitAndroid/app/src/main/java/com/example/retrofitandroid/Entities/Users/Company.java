package com.example.retrofitandroid.Entities.Users;

public class Company {

    //Private Attributes
    private String companyName;
    private String catchPhrase;
    private String bs;

    //Constructor

    public Company(String companyName, String catchPhrase, String bs) {
        this.companyName = companyName;
        this.catchPhrase = catchPhrase;
        this.bs = bs;
    }

    //Getters and Setters

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public void setCatchPhrase(String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }
}
