package com.example.multiplefragmentstry.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.multiplefragmentstry.MainActivity;
import com.example.multiplefragmentstry.R;
import com.example.multiplefragmentstry.ViewModels.MainActivityVM;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link FirstFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class FirstFragment extends Fragment implements View.OnClickListener{
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public FirstFragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment FirstFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static FirstFragment newInstance(String param1, String param2) {
//        FirstFragment fragment = new FirstFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    private Button btn1;
    private MainActivityVM vm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btn1 = view.findViewById(R.id.btnFragment1);
        btn1.setOnClickListener(this); //TODO ver si esto va o poner requireActivity()

        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        return view;
    }

    @Override
    public void onClick(View v) {
        vm.setBtnID(R.id.btnFragment1);
    }
}