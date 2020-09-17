package com.example.retrofitandroid.Retrofit.Posts;

import com.example.retrofitandroid.Entities.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface IPost {

    @GET("/posts/{id}")
    Call<Post> getPost(@Path("id") int id);

    @GET("/posts")
    Call<List<Post>> getAllPosts();
}
