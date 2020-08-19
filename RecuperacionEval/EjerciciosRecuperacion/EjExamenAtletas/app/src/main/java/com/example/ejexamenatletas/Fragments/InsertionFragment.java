package com.example.ejexamenatletas.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejexamenatletas.ApiRepository.ApiDbRepository;
import com.example.ejexamenatletas.Entities.Athlete;
import com.example.ejexamenatletas.R;
import com.example.ejexamenatletas.ViewModels.MainActivityVM;

public class InsertionFragment extends Fragment implements View.OnClickListener {

    private EditText editName;
    private EditText editSurname;
    private EditText editObservations;
    private Button btnInsert;
    private MainActivityVM vm;
    private ApiDbRepository repository;
    private Athlete athlete;

    public InsertionFragment() {

    }

    public InsertionFragment(ApiDbRepository repository) {
        this.repository = repository;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_insertion, container, false);

        editName = view.findViewById(R.id.editName);
        editSurname = view.findViewById(R.id.editSurname);
        editObservations = view.findViewById(R.id.editObservations);
        btnInsert = view.findViewById(R.id.btnInsert);

//        btnInsert.setOnClickListener(InsertionFragment.this);
        btnInsert.setOnClickListener(InsertionFragment.this);


        //Instancio el VM
        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        return view;
    }


    @Override
    public void onClick(View v) {
        //Si los datos son correctos los inserta, si no, no hace nada
        if(checkData()){
            insertData();
        }
    }

    /**
     * Método que inserta datos en base de datos a través del repository
     */
    private void insertData() {
        //Inserto los datos
        repository.insertAthlete(athlete);
    }

    /**
     * Método que valida los datos introducidos y los asigna a un objeto atleta
     * @return boolean correct, que indica si los datos son correctos o no
     */
    private boolean checkData() {
        boolean correct = false;
        //Extraigo los datos de la vista
        String name = editName.getText().toString();
        String surname = editSurname.getText().toString();
        String observations = editObservations.getText().toString();

        //Si el hueco del nombre y apellidos están vacíos muestra mensaje incándolo
        if (name.trim().isEmpty() || surname.trim().isEmpty()) {
//            Toast.makeText(requireActivity(), "Debes escribir nombre y apellidos", Toast.LENGTH_SHORT).show();
            Toast.makeText(requireActivity(), getResources().getString(R.string.textValidation), Toast.LENGTH_SHORT).show();
        } else {
            //Indico que los datos son correctos
            correct = true;
            //Paso los datos al atleta creado
            athlete = new Athlete(name, surname, observations);
        }
        return correct;
    }
}