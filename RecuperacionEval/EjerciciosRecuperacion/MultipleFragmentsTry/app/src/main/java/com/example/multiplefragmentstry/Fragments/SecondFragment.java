package com.example.multiplefragmentstry.Fragments;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.multiplefragmentstry.R;
import com.example.multiplefragmentstry.ViewModels.MainActivityVM;

public class SecondFragment extends Fragment implements View.OnClickListener {

    private Button btnMarco;
    private Button btnPolo;
    private MainActivityVM vm;
    /*TODO aquí hacer más botones para cambiar el texto del tercer fragment, como prueba*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        btnMarco = view.findViewById(R.id.btnFragment2);
        btnPolo = view.findViewById(R.id.btnFragment2_1);

        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        btnMarco.setOnClickListener(this);
        btnPolo.setOnClickListener(this);

        return view;
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);
//
//        vm.getBtnID().observe(getActivity(), new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//
//            }
//        });
//    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFragment2:
                vm.setSelectedText(btnMarco.getText().toString());
                break;

            case R.id.btnFragment2_1:
                vm.setSelectedText(btnPolo.getText().toString());
                break;

        }
    }
}