package com.example.ejbasicofragmentsinterface;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ejbasicofragmentsinterface.ViewModels.FragmentsSharedViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentBotones extends Fragment implements View.OnClickListener {

    private Button boton1;
    private Button boton2;
    private FragmentsSharedViewModel vm;

    public FragmentBotones() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Contiene los elementos de la vista del fragment
        View view = inflater.inflate(R.layout.fragment_fragment_botones, container, false);

        //Instancio el ViewModel
        vm = new ViewModelProvider(requireActivity()).get(FragmentsSharedViewModel.class);

        //Instancio elementos de la vista
        boton1 = view.findViewById(R.id.boton1);
        boton2 = view.findViewById(R.id.boton2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        //Paso al ViewModel el id del elemento de la vista seleccionado
//        vm.setBotonSeleccionado(v.getId());

        //Pasa al ViewModel el texto correspondiente al botón pulsado
        switch (v.getId()) {
            case R.id.boton1:
                vm.setTextoAMostrar("Soy el botón 1");
                break;
            case R.id.boton2:
                vm.setTextoAMostrar("Soy el botón 2");
                break;
        }
    }
}
