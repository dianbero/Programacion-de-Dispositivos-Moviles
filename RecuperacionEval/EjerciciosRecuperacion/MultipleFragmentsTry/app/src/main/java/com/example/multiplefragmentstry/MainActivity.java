package com.example.multiplefragmentstry;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
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

    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vm = new ViewModelProvider(this).get(MainActivityVM.class);
        //Fragments transactions
//        fragmentManager = getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();



//        if (savedInstanceState == null) {

            fragment1 = new FirstFragment();
//            getSupportFragmentManager().beginTransaction().add(R.id.sharedContainer, fragment1).commit();
            getSupportFragmentManager().beginTransaction().add(R.id.sharedContainer, fragment1, "1").commit();
//        fragmentTransaction.add(R.id.sharedContainer, fragment1,"1");

            vm.getBtnID().observe(this, new Observer<Integer>() {
                @Override
                public void onChanged(Integer integer) {
                    fragment2 = new SecondFragment();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment2).addToBackStack(null).commit();
                    getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment2, "2").addToBackStack(null).commit();
//                fragmentTransaction.replace(R.id.sharedContainer, fragment2,"2").addToBackStack(null);

//                    fragmentTransaction.commit();

                }
            });

            vm.getSelectedText().observe(this, new Observer<String>() {
                @Override
                public void onChanged(String s) {
                    fragment3 = new ThirdFragment(s);
//                fragment3 = new ThirdFragment();
//                    getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment3).addToBackStack(null).commit();
                    getSupportFragmentManager().beginTransaction().replace(R.id.sharedContainer, fragment3, "3").addToBackStack(null).commit();
//                fragmentTransaction.replace(R.id.sharedContainer, fragment3, "3").addToBackStack(null);

                }
            });

//            fragmentTransaction.commit();

        }//else {
//            fragment1 = fragmentManager.findFragmentByTag("1");
//            fragment2 = fragmentManager.findFragmentByTag("2");
//            fragment3 = fragmentManager.findFragmentByTag("3");
//
//        }


//        fragmentTransaction.addToBackStack(null).commit();
//
////        if (fragmentManager.getBackStackEntryCount() > 0) {
////            fragmentManager.popBackStack();
//
//        boolean check = getSupportFragmentManager().getBackStackEntryCount() > 0;
//
//        if (check) {
//            getSupportFragmentManager().popBackStackImmediate();
//        }

//        }
    }