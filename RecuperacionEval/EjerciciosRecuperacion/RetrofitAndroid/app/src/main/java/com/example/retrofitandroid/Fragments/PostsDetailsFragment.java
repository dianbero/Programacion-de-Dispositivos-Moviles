package com.example.retrofitandroid.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.retrofitandroid.Entities.Post;
import com.example.retrofitandroid.R;
import com.example.retrofitandroid.ViewModels.MainActivityVM;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PostsDetailsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PostsDetailsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PostsDetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PostsDetailsFragment newInstance(String param1, String param2) {
        PostsDetailsFragment fragment = new PostsDetailsFragment();
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

    //Private Atributtes
    private TextView title;
    private TextView body;
    private MainActivityVM vm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_posts_details, container, false);

        vm = new ViewModelProvider(requireActivity()).get(MainActivityVM.class);

        title = view.findViewById(R.id.title);
        body = view.findViewById(R.id.body);

        Post post = vm.getPostDetails();

        title.setText(post.getTitle());
        body.setText(post.getBody());


//        vm.getPostDetails().observe(getActivity(), new Observer<Post>() {
//            @Override
//            public void onChanged(Post post) {
//                title.setText(post.getTitle());
//                body.setText(post.getBody());
//            }
//        });

        return view;
    }
}