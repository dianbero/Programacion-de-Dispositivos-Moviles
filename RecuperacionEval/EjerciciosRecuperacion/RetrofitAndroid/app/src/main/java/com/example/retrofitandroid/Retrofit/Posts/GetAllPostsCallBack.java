package com.example.retrofitandroid.Retrofit.Posts;

import android.content.Context;
import android.widget.Toast;

import com.example.retrofitandroid.Entities.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetAllPostsCallBack implements Callback<List<Post>> {
    //Private Attributes
    private List<Post> postList;
    private Context context;

    public GetAllPostsCallBack(Context context) {
        this.context = context;
    }

    @Override
    public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
        postList = response.body();
    }

    @Override
    public void onFailure(Call<List<Post>> call, Throwable t) {
        Toast.makeText(context, "Error al intentar obtener listado de posts", Toast.LENGTH_SHORT).show();
    }

}
