package com.example.retrofitandroid.Retrofit.Posts;

import android.content.Context;
import android.widget.Toast;

import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.Entities.Users.User;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetPostCallBack implements Callback<Post> {
    //Private Attributes
    private  Post post;
    private Context context;

    public GetPostCallBack(Context context) {
        this.context = context;
    }

    @Override
    public void onResponse(Call<Post> call, Response<Post> response) {
        post = response.body();
    }

    @Override
    public void onFailure(Call<Post> call, Throwable t) {
        //Mensaje de error
        Toast.makeText(context, "No se pudo obtener el post", Toast.LENGTH_SHORT).show();
    }
}
