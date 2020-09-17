package com.example.retrofitandroid.Adapters.ViewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.retrofitandroid.Adapters.Interfaces.ClickListener;
import com.example.retrofitandroid.R;

public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    //Private Attributes
    private TextView elementName;
    private ClickListener listener;

    //Cosntructor
    public ListViewHolder(@NonNull View itemView, ClickListener listener) {
        super(itemView);
        this.elementName = itemView.findViewById(R.id.elementName);
        this.listener = listener;
        //Le asigno el listener del evento de click
        itemView.setOnClickListener(this);

    }

    //Getters and Setters

    public TextView getElementName() {
        return elementName;
    }

    public void setElementName(TextView elementName) {
        this.elementName = elementName;
    }

    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition());
    }
}
