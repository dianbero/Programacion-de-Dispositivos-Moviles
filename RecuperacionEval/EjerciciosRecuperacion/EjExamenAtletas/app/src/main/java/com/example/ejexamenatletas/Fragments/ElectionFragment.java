package com.example.ejexamenatletas.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejexamenatletas.R;
import com.example.ejexamenatletas.ViewModels.MainActivityVM;
import com.example.ejexamenatletas.ViewModels.ViewModelFactories.MainActivityVMFactory;

public class ElectionFragment extends Fragment implements View.OnClickListener{

    private Button btnInsert;
    private Button btnList;
    private Intent intent;
    private MainActivityVM vm;
    private MainActivityVMFactory vmFactory;

    public ElectionFragment() {
        // Required empty public constructor
    }

    /**
     * Contructor con factory necesario para el VM
     * @param vmFactory MainActivityVMFactory
     */
    public ElectionFragment(MainActivityVMFactory vmFactory) {
        this.vmFactory = vmFactory;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_election, container, false);

        btnInsert = view.findViewById(R.id.btnInsertar);
        btnList = view.findViewById(R.id.btnListar);



        //Instancio VM
//        vm = new ViewModelProvider(requireActivity(), vmFactory).get(MainActivityVM.class);
        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        btnInsert.setOnClickListener(this);
        btnList.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnInsertar:
                vm.setSelectedBotomName("insert");
                break;

            case R.id.btnListar:
                vm.setSelectedBotomName("list");
                break;
        }
    }
}

