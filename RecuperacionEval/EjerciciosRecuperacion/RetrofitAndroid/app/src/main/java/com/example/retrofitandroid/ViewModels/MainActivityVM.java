package com.example.retrofitandroid.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.Entities.Users.User;
import com.example.retrofitandroid.Repository.PostsRepository;

import java.util.List;

public class MainActivityVM extends AndroidViewModel {

    //Private Attributes
    private MutableLiveData<Integer> elementPosition;
    private LiveData<List<Post>> postsList;
    private LiveData<List<User>> usersList;
    private MutableLiveData<User> userDetails;
    private MutableLiveData<Post> postDetails;
    private PostsRepository postsRepository;

    //Para el manejo de Fragments
    private MutableLiveData<Integer> idButtonSelected;

    //Constructor
    public MainActivityVM(@NonNull Application application) {
        super(application);
        postsRepository  = new PostsRepository(application);
        this.elementPosition = new MutableLiveData<>();
//        this.postsList = new MutableLiveData<>();
        this.userDetails = new MutableLiveData<>();
        this.userDetails = new MutableLiveData<>();
        this.postDetails = new MutableLiveData<>();
        this.idButtonSelected = new MutableLiveData<>();
//        this.postsList = postsRepository.getAllPosts();
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

    public Post getPostDetails() {
        return  postsList.getValue().get(elementPosition.getValue());
//        return postDetails;
    }

    //TODO comprobar que esto funciona
    public void setPostDetails(Post postDetails) {
//        this.postDetails.setValue(postsList.getValue().get(elementPosition.getValue()));

        this.postDetails.setValue(postDetails);
    }

    public MutableLiveData<Integer> getIdButtonSelected() {
        return idButtonSelected;
    }

    public void setIdButtonSelected(int idButtonSelected) {
        this.idButtonSelected.setValue(idButtonSelected);
    }

    public LiveData<List<Post>> getPostsList() {
        this.postsList = postsRepository.getAllPosts();
        return postsList;
    }

//    public void setPostsList(List<Post> postsList) {
//        this.postsList.setValue(postsList);
//    }

    //TODO implementar usersRepository
    public LiveData<List<User>> getUsersList() {

        return usersList;
    }

    public void setUsersList(MutableLiveData<List<User>> usersList) {
        this.usersList = usersList;
    }
}
