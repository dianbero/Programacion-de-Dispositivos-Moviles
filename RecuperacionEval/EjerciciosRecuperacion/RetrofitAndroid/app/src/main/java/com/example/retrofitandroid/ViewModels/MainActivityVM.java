package com.example.retrofitandroid.ViewModels;

import android.content.Intent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.Entities.Users.User;

public class MainActivityVM {

    //Private Attributes
    private MutableLiveData<Integer> elementPosition;
    private MutableLiveData<User> userDetails;
    private MutableLiveData<Post> postDetails;

    //Para el manejo de Fragments
    private MutableLiveData<Integer> idButtonSelected;
    //Constructor

    public MainActivityVM() {
        this.elementPosition = new MutableLiveData<>();
        this.userDetails = new MutableLiveData<>();
        this.postDetails = new MutableLiveData<>();
        this.idButtonSelected = new MutableLiveData<>();
    }

    //Getters and Setters

    public MutableLiveData<Integer> getElementPosition() {
        return elementPosition;
    }

    public void setElementPosition(int elementPosition) {
        this.elementPosition.setValue(elementPosition);
    }

    public MutableLiveData<User> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(User userDetails) {
        this.userDetails.setValue(userDetails);
    }

    public LiveData<Post> getPostDetails() {
        return postDetails;
    }

    public void setPostDetails(Post postDetails) {
        this.postDetails.setValue(postDetails);
    }

    public MutableLiveData<Integer> getIdButtonSelected() {
        return idButtonSelected;
    }

    public void setIdButtonSelected(int idButtonSelected) {
        this.idButtonSelected.setValue(idButtonSelected);
    }
}
