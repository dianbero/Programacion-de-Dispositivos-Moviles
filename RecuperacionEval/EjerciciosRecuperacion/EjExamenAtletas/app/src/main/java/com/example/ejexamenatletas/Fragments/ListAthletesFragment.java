package com.example.ejexamenatletas.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.ejexamenatletas.Adapters.AthleteAdapter;
import com.example.ejexamenatletas.Entities.Athlete;
import com.example.ejexamenatletas.Interfaces.IRecyclerViewListener;
import com.example.ejexamenatletas.R;
import com.example.ejexamenatletas.ViewModels.MainActivityVM;

import java.util.ArrayList;
import java.util.List;

public class ListAthletesFragment extends Fragment  /*View.OnClickListener*/  /*IRecyclerViewListener*/ {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private MainActivityVM vm;

    public ListAthletesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list_athletes, container, false);
        //Obtengo la vista del elemento del RecyclerView
        recyclerView = view.findViewById(R.id.recyclerViewAthlete);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        //Instancio VM
        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);


        //En este caso uso un LinearLayoutManager, por que es una lista tal cual
        layoutManager = new LinearLayoutManager(requireActivity());
        recyclerView.setLayoutManager(layoutManager);

        //Listener para cuando se clica el botón
         final IRecyclerViewListener listener = new IRecyclerViewListener() {
            @Override
            public void onClick(View v, int position) {
                vm.setElementPosition(position);
//                Toast.makeText(getActivity(), listaPrueba.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        };


        //Observo el listado de atletas, para pasarlos al adapadapter y mostrarlo en la vista
        vm.getAthleteList().observe(requireActivity(), new Observer<List<Athlete>>() {
            @Override
            public void onChanged(List<Athlete> athletes) {
                adapter = new AthleteAdapter((ArrayList<Athlete>) athletes, listener);
                recyclerView.setAdapter(adapter);

            }
        });


        return view;
    }

}