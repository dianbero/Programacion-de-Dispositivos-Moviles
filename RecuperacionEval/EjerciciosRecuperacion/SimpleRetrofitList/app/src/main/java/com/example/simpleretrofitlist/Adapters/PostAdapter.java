package com.example.simpleretrofitlist.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simpleretrofitlist.Adapters.ViewHolders.PostsViewHolder;
import com.example.simpleretrofitlist.Entities.Post;
import com.example.simpleretrofitlist.R;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostsViewHolder> {

    //Private Attributes
    private List<Post> postList;
    private PostsViewHolder viewHolder;

    public PostAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public PostsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View nameView = LayoutInflater.from(parent.getContext()).inflate(R.layout.athlete_row, null, false);
        viewHolder = new PostsViewHolder(nameView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PostsViewHolder holder, int position) {
        holder.getPostName().setText(postList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
