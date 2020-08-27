package com.example.multiplefragmentstry.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.multiplefragmentstry.R;
import com.example.multiplefragmentstry.ViewModels.MainActivityVM;

public class ThirdFragment extends Fragment {

    private String text;
    private TextView tvText;
    private MainActivityVM vm;

    public ThirdFragment() {
    }

    public ThirdFragment(String texto) {
        this.text = texto;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_third, container, false);

        tvText = view.findViewById(R.id.texto3);
        tvText.setText(text);

        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

//        vm.getSelectedText().observe(requireActivity(), new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                tvText.setText(s);
//            }
//        });




        return view;
    }
}