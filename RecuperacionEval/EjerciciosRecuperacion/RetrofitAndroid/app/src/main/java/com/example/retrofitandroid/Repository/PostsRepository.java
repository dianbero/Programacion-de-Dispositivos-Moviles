package com.example.retrofitandroid.Repository;

import android.content.Context;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.Retrofit.Posts.GetAllPostsCallBack;
import com.example.retrofitandroid.Retrofit.Posts.GetPostCallBack;
import com.example.retrofitandroid.Retrofit.Posts.IPost;
import com.example.retrofitandroid.Retrofit.Posts.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class PostsRepository {
    //Private Attributes
    private Context context;
    private final static String SERVER_URL = "http://jsonplaceholder.typicode.com";
    private Retrofit retrofit;
    private GetAllPostsCallBack getAllPostsCallBack;
    private GetPostCallBack getPostCallBack;
    private IPost iPostService;
    private MutableLiveData<Post> post;
    private MutableLiveData<List<Post>> allPosts;

    public PostsRepository(Context context) {
        this.context = context;
//        getAllPostsCallBack = new GetAllPostsCallBack(context);
//        getPostCallBack = new GetPostCallBack(context);
        //Instancio retrofit
//        retrofit = new Retrofit
//                .Builder()
//                .baseUrl(SERVER_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        iPost = retrofit.create(IPost.class);

        //Habiendo creado ya una instancia de retrofit en otra clase
        iPostService = RetrofitClientInstance.getRetrofitInstance().create(IPost.class);


    }

    public MutableLiveData<Post> getPost(int id) {
//        iPostService.getPost(id).enqueue(getPostCallBack);
        if (post == null) {
            post = new MutableLiveData<>();
            Call<Post> postCall = iPostService.getPost(id);
            postCall.enqueue(new Callback<Post>() {
                @Override
                public void onResponse(Call<Post> call, Response<Post> response) {
                    post.setValue(response.body());
                }

                @Override
                public void onFailure(Call<Post> call, Throwable t) {
                    Toast.makeText(context, "No se pudo obtener el post", Toast.LENGTH_SHORT).show();
                }
            });
        }

        return post;
    }

    public void setPost(Post post) {
//        this.post = post;
        //Esto no lo uso porque no tengo implementado la opción de insertar un post
    }

    public LiveData<List<Post>> getAllPosts() {
        if (allPosts == null) {
            allPosts = new MutableLiveData<>();
            Call<List<Post>> allPostCall = iPostService.getAllPosts();
            allPostCall.enqueue(new Callback<List<Post>>() {
                @Override
                public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                    allPosts.setValue(response.body());
                }

                @Override
                public void onFailure(Call<List<Post>> call, Throwable t) {
                    Toast.makeText(context, "Error getting all posts", Toast.LENGTH_SHORT).show();
                }
            });

        }

        return allPosts;
    }

    public void setAllPosts(List<Post> allPosts) {
//        this.allPosts = allPosts;
    }
}
