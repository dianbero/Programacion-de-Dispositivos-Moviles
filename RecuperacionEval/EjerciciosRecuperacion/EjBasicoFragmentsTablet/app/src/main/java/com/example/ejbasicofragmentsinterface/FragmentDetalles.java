package com.example.ejbasicofragmentsinterface;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.ejbasicofragmentsinterface.ViewModels.FragmentsSharedViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetalles extends Fragment {

    private FragmentsSharedViewModel vm;
    private TextView textView;
//    private String texto;

    public FragmentDetalles() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detalles, container, false);
        textView = view.findViewById(R.id.textoBoton);

        //Inicializo el ViewModel
//        vm = new ViewModelProvider(requireActivity()).get(FragmentsSharedViewModel.class);

//        final Observer<String> observer = new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                //Actualizo la vista
//                textView.setText(s);
//            }
//        };
//
//        vm.getTextoAMostrar().observe(requireActivity(), observer);

        textView.setText(getArguments().getString("texto"));
        return view;
    }

    public static FragmentDetalles newInstance(String texto) {
        FragmentDetalles fragment = new FragmentDetalles();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
        args.putString("texto", texto);
        fragment.setArguments(args);
        return fragment;
    }
}
