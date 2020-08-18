package com.example.ejexamenatletas.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejexamenatletas.Interfaces.IRecyclerViewListener;
import com.example.ejexamenatletas.R;

public class AthleteViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

    //Private attributes
    private TextView tvName;
    private IRecyclerViewListener listener;

    //Constructor
//    public AthleteViewHolder(@NonNull TextView tvName) {
//        super(tvName);
//        this.tvName = tvName;
//        this.listener = listener;
//        tvName.setOnClickListener(this);
//    }


    public AthleteViewHolder(@NonNull View itemView, IRecyclerViewListener listener) {
        super(itemView);
        this.tvName = (TextView) itemView.findViewById(R.id.athleteName);
        this.listener = listener;
        tvName.setOnClickListener(this);
    }

    //Getter and setters
    public TextView getTvName() {
        return tvName;
    }

    public void setTvName(TextView tvName) {
        this.tvName = tvName;
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition());
    }
}
