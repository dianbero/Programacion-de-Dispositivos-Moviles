package com.example.retrofitandroid.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retrofitandroid.R;
import com.example.retrofitandroid.ViewModels.MainActivityVM;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link UsersDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class UsersDetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public UsersDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment UsersDetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static UsersDetailsFragment newInstance(String param1, String param2) {
        UsersDetailsFragment fragment = new UsersDetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private TextView name;
    private TextView email;
    private TextView company;
    private MainActivityVM vm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_users_details, container, false);
        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        company = view.findViewById(R.id.company);

        return view;
    }
}