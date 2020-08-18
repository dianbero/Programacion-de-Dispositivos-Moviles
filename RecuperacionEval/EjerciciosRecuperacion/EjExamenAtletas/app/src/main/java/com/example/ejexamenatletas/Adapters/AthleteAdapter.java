package com.example.ejexamenatletas.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejexamenatletas.Entities.Athlete;
import com.example.ejexamenatletas.Interfaces.IRecyclerViewListener;
import com.example.ejexamenatletas.R;
import com.example.ejexamenatletas.ViewHolders.AthleteViewHolder;

import java.util.ArrayList;

public class AthleteAdapter extends RecyclerView.Adapter<AthleteViewHolder> {

    //Private Attributes
    private ArrayList<Athlete> athletesList;
    private IRecyclerViewListener listener;

    // Provide a suitable constructor (depends on the kind of dataset)
    public AthleteAdapter(ArrayList<Athlete> athletesList, IRecyclerViewListener listener) {
        this.athletesList = athletesList;
        this.listener = listener;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public AthleteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Create a new view

        View nameView = LayoutInflater.from(parent.getContext()).inflate(R.layout.athlete_row, null, false);
//        TextView nameView = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.athlete_row, parent, false);

        //Instancio el viewHolder y le paso el elemento de la vista "inflado"
//        AthleteViewHolder viewHolder = new AthleteViewHolder(nameView, listener);
        AthleteViewHolder viewHolder = new AthleteViewHolder(nameView, listener);


        return viewHolder;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull AthleteViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        //Como lo que muestra es el nombre del atleta, le paso el string del nombre del elemento que corresponde
        holder.getTvName().setText(athletesList.get(position).getName());


    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return athletesList.size();
    }


}
