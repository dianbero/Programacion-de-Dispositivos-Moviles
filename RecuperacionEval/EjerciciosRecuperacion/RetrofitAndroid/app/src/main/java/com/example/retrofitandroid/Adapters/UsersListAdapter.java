package com.example.retrofitandroid.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitandroid.Adapters.Interfaces.ClickListener;
import com.example.retrofitandroid.Adapters.ViewHolders.ListViewHolder;
import com.example.retrofitandroid.Entities.Users.User;
import com.example.retrofitandroid.R;

import java.util.List;

public class UsersListAdapter extends RecyclerView.Adapter<ListViewHolder> {
    //Private Attributes
    private List<User> userList;
    private ListViewHolder viewHolder;
    private ClickListener listener;

    //Constructor


    public UsersListAdapter(List<User> userList, ClickListener clickListener) {
        this.userList = userList;
        this.listener = clickListener;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View nameView = LayoutInflater.from(parent.getContext()).inflate(R.layout.athlete_row, null, false);
        viewHolder = new ListViewHolder(nameView, listener);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {

        holder.getElementName().setText(userList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }
}
