package com.example.simpleretrofitlist.APIRespository;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.simpleretrofitlist.Entities.Post;
import com.example.simpleretrofitlist.Retrofit.Interfaces.IPost;
import com.example.simpleretrofitlist.Retrofit.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {
    //Private Attributes
    private MutableLiveData<List<Post>> postList;
    private IPost iPostService;
    private Context context;

    public Repository(Context context) {
        this.context = context;
        iPostService = RetrofitClientInstance.getRetrofitInstance().create(IPost.class);

    }

    public MutableLiveData<List<Post>> getPostList() {
        if (postList == null) {
            postList = new MutableLiveData<>();
            Call<List<Post>> allPostCall = iPostService.getAllPosts();
            allPostCall.enqueue(new Callback<List<Post>>() {
                @Override
                public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                    postList.setValue(response.body());
                }

                @Override
                public void onFailure(Call<List<Post>> call, Throwable t) {
                    Toast.makeText(context, "No se pudo obtener el post", Toast.LENGTH_SHORT).show();
                }
            });

        }
        return postList;
    }
}
