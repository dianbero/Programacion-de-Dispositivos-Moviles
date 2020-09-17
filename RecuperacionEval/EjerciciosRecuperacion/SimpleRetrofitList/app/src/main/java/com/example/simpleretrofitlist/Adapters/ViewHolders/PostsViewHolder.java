package com.example.simpleretrofitlist.Adapters.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simpleretrofitlist.R;

public class PostsViewHolder extends RecyclerView.ViewHolder {
    //Private Attributes
    private TextView postName;

    public PostsViewHolder(@NonNull View itemView) {
        super(itemView);
        postName = itemView.findViewById(R.id.postName);
    }

    //Getters and Setters


    public TextView getPostName() {
        return postName;
    }

    public void setPostName(TextView postName) {
        this.postName = postName;
    }
}
