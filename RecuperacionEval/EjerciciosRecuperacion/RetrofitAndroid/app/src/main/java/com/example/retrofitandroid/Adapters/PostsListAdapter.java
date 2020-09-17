package com.example.retrofitandroid.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitandroid.Adapters.Interfaces.ClickListener;
import com.example.retrofitandroid.Adapters.ViewHolders.ListViewHolder;
import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.Entities.Users.User;
import com.example.retrofitandroid.R;

import java.util.List;

public class PostsListAdapter extends RecyclerView.Adapter<ListViewHolder> {

    //Private Attributes
    private List<Post> postList;
    private ListViewHolder viewHolder;
    private ClickListener clickListener;


    //Constructor
    public PostsListAdapter(List<Post> postList, ClickListener clickListener) {
        this.postList = postList;
        this.clickListener = clickListener;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View nameView = LayoutInflater.from(parent.getContext()).inflate(R.layout.athlete_row, null, false);
        viewHolder = new ListViewHolder(nameView, clickListener);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        holder.getElementName().setText(postList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }
}
