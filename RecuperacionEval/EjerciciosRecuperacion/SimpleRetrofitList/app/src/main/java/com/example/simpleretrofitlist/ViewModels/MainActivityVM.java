package com.example.simpleretrofitlist.ViewModels;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.simpleretrofitlist.APIRespository.Repository;
import com.example.simpleretrofitlist.Entities.Post;

import java.util.List;

public class MainActivityVM extends AndroidViewModel {
    //Private Attributes
    private MutableLiveData<List<Post>> postList;
    private Repository repository;

    public MainActivityVM(@NonNull Application application) {
        super(application);
        this.postList = new MutableLiveData<>();
        this.repository = new Repository(application);
    }


    public MutableLiveData<List<Post>> getPostList() {
        postList = repository.getPostList();
        return postList;
    }
}
