package com.example.multiplefragmentstry.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.multiplefragmentstry.R;

public class ThirdFragment extends Fragment {

    private String text;
    private TextView tvText;

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


        return view;
    }
}