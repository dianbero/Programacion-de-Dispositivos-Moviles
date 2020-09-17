package com.example.retrofitandroid.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.retrofitandroid.Adapters.Classes.RecyclerTouchListener;
import com.example.retrofitandroid.Adapters.Interfaces.ClickListener;
import com.example.retrofitandroid.Adapters.PostsListAdapter;
import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.R;
import com.example.retrofitandroid.ViewModels.Factory.FactoryVM;
import com.example.retrofitandroid.ViewModels.MainActivityVM;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListFragment extends Fragment /*implements ClickListener*/{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListFragment newInstance(String param1, String param2) {
        ListFragment fragment = new ListFragment();
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

    //Private Attirbutes
    private RecyclerView recyclerView;
//    private PostsListAdapter postsListAdapter;
    private MainActivityVM vm;
    private PostsListAdapter postsAdapter;
    private UsersDetailsFragment userAdapter;
    private FactoryVM factoryVM;
    private List<Post> posts;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        //TODO ver si funciona sin el factory aquí
        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        recyclerView = view.findViewById(R.id.recyclerView);
        //LineatLayoutManager tells the RecyclerView that the view
        //must be arranged in linear fashion
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        //Aplico el listener del click
        //TODO ver si esto funciona, si no, hacerlo con la forma comentada
//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getContext(), new ClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                vm.setElementPosition(position);
//            }
//        }, vm));

        ClickListener listener = new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                vm.setElementPosition(position);
            }
        };


        vm.getPostsList().observe(requireActivity(), new Observer<List<Post>>() {
            @Override
            public void onChanged(List<Post> postList) {
                posts = postList;
                postsAdapter = new PostsListAdapter(postList, listener);
                recyclerView.setAdapter(postsAdapter);
            }
        });

//        postsAdapter = new PostsListAdapter(posts, this);
//        recyclerView.setAdapter(postsAdapter);




//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new ClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                //Paso la posición del elemento seleccionado
//                vm.setElementPosition(position);
//            }
//        }));





        return view;
    }

//    @Override
//    public void onClick(View view, int position) {
//        vm.setElementPosition(position);
//    }

    //    @Override
//    public void onClick(View view, int position) {
//        //Paso la posición del elemento seleccionado
//        vm.setElementPosition(position);
//    }
}