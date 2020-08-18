package com.example.ejexamenatletas.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ejexamenatletas.Entities.Athlete;
import com.example.ejexamenatletas.R;
import com.example.ejexamenatletas.ViewModels.MainActivityVM;

import java.util.List;

public class DetailsFragment extends Fragment {

    //Private attributes
    private TextView name;
    private TextView surname;
    private TextView observations;
    private MainActivityVM vm;
    private int elementPosition;

    public DetailsFragment() {
        // Required empty public constructor
    }

    public DetailsFragment(int elementPosition) {
        this.elementPosition = elementPosition;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        name = view.findViewById(R.id.name);
        surname = view.findViewById(R.id.surname);
        observations = view.findViewById(R.id.observations);

        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        //Hacer esto (lo comentado) daba error, no se puede observar dentro de otro observable,
        // pillaba la actividad como null, la solución fue observar el entero en MainActivity
        // y pasárselo como parámetro al Fragment
//        vm.getElementPosition().observe(requireActivity(), new Observer<Integer>() {
//            @Override
//            public void onChanged(final Integer integer) {

        vm.getAthleteList().observe(getActivity(), new Observer<List<Athlete>>() {
            @Override
            public void onChanged(List<Athlete> athletes) {
                Athlete athlete = athletes.get(elementPosition);

                name.setText(athlete.getName());
                surname.setText(athlete.getSurname());
                observations.setText(athlete.getObservations());
            }
        });
//            }
//        });

        return view;
    }
}