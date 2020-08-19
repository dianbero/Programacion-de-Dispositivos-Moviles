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
    public AthleteViewHolder(@NonNull View itemView, IRecyclerViewListener listener) {
        super(itemView);
        //Intancio los elementos de la vista
        this.tvName = (TextView) itemView.findViewById(R.id.athleteName);
        //Le asigno el listener y el contexto, para que responda al evento de click
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

    /**
     * Método que realiza una acción en respuesta al evento de click
     * En este caso al clickar un elemento de la lista
     * @param v el elemento clickado
     */
    @Override
    public void onClick(View v) {
        listener.onClick(v, getAdapterPosition());
    }
}
