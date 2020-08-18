package com.example.multiplefragmentstry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.multiplefragmentstry.Fragments.FirstFragment;
import com.example.multiplefragmentstry.Fragments.SecondFragment;
import com.example.multiplefragmentstry.Fragments.ThirdFragment;
import com.example.multiplefragmentstry.ViewModels.MainActivityVM;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment1;
    private Fragment fragment2;
    private Fragment fragment3;
    private MainActivityVM vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vm = new ViewModelProvider(this).get(MainActivityVM.class);

        fragment1 = new FirstFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.sharedContainer, fragment1).commit();

        vm.getBtnID().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                fragment2 = new SecondFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment2).addToBackStack(null).commit();

            }
        });

        vm.getSelectedText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                fragment3 = new ThirdFragment(s);
                getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment3).addToBackStack(null).commit();
            }
        });


    }
}