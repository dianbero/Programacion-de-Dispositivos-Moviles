package com.example.simpleretrofitlist.Retrofit.Interfaces;

import com.example.simpleretrofitlist.Entities.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPost {
    @GET("/posts")
    Call<List<Post>> getAllPosts();
}
