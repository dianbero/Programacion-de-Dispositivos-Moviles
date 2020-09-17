package com.example.simpleretrofitlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simpleretrofitlist.Adapters.PostAdapter;
import com.example.simpleretrofitlist.Entities.Post;
import com.example.simpleretrofitlist.ViewModels.FactoryVM.FactoryVM;
import com.example.simpleretrofitlist.ViewModels.MainActivityVM;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Private Attributes
    private RecyclerView recyclerView;
    private MainActivityVM vm;
    private PostAdapter postAdapter;
    private FactoryVM factoryVM;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.listaPosts);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        factoryVM = new FactoryVM(getApplication());
        vm = new ViewModelProvider(this, factoryVM).get(MainActivityVM.class);

        vm.getPostList().observe(this, new Observer<List<Post>>() {
            @Override
            public void onChanged(List<Post> posts) {
                postAdapter = new PostAdapter(posts);
                recyclerView.setAdapter(postAdapter);
            }
        });


    }
}