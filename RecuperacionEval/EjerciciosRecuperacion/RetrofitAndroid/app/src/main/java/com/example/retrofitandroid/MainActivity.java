package com.example.retrofitandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.example.retrofitandroid.Fragments.ListFragment;
import com.example.retrofitandroid.Fragments.MainFragment;
import com.example.retrofitandroid.Fragments.PostsDetailsFragment;
import com.example.retrofitandroid.Fragments.UsersDetailsFragment;
import com.example.retrofitandroid.ViewModels.Factory.FactoryVM;
import com.example.retrofitandroid.ViewModels.MainActivityVM;

public class MainActivity extends AppCompatActivity {

    //Private Attributes
    private MainFragment mainFragment;
    private ListFragment listFragment;
    //    private PostsDetailsFragment postsDetailsFragment;
//    private UsersDetailsFragment usersDetailsFragment;
    private Fragment fragment;

    private MainActivityVM vm;
    private FactoryVM factoryVM;
    private FragmentManager fragmentManager;
    private FragmentTransaction fragmentTransactionMain;
    private FragmentTransaction fragmentTransactionList;
    private FragmentTransaction fragmentTransactionPostDetails;
    private FragmentTransaction fragmentTransactionUserDetails;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factoryVM = new FactoryVM(getApplication());
        vm = new ViewModelProvider(this,factoryVM).get(MainActivityVM.class);

        mainFragment = new MainFragment();
        listFragment = new ListFragment();


//        fragmentManager = getSupportFragmentManager();

        fragmentTransactionMain = getSupportFragmentManager().beginTransaction();
        fragmentTransactionList = getSupportFragmentManager().beginTransaction();
        fragmentTransactionPostDetails = getSupportFragmentManager().beginTransaction();
        fragmentTransactionUserDetails = getSupportFragmentManager().beginTransaction();

        //Abro main fragment
//        fragmentTransactionMain.add(R.id.contenedorCompartido, mainFragment).commit();
//        getSupportFragmentManager().beginTransaction().add(R.id.contenedorCompartido, mainFragment).commit();
        fragmentTransactionMain.add(R.id.contenedorCompartido, mainFragment).commit();

        vm.getIdButtonSelected().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                switch (integer) {
                    case R.id.postBtn:
                        fragment = new ListFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorCompartido, listFragment).addToBackStack(null).commit();
//                        fragmentTransactionList.replace(R.id.contenedorCompartido, listFragment).addToBackStack(null).commit();

                        fragment = new PostsDetailsFragment();
                        openDetailsFragment(fragment);
                    case R.id.usersBtn:
//                        fragment = new ListFragment();
//                        fragmentTransactionList.replace(R.id.contenedorCompartido, listFragment).addToBackStack(null).commit();
//
//                        fragment = new UsersDetailsFragment();
//                        openDetailsFragment(fragment);
                        break;
                }
//                fragment = new ListFragment();
//                getSupportFragmentManager().beginTransaction().replace(R.id.contenedorCompartido, listFragment).addToBackStack(null).commit();
//                openDetailsFragment(fragment);
            }
        });

        //Abrir fragment detalles


    }

    private void openDetailsFragment(final Fragment fragment) {
        vm.getElementPosition().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
//                fragmentTransactionPostDetails.replace(R.id.contenedorCompartido, fragment).addToBackStack(null).commit();
                getSupportFragmentManager().beginTransaction().replace(R.id.contenedorCompartido, fragment).addToBackStack(null).commit();
            }
        });
//        vm.getElementPosition().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//
//                if (fragment instanceof PostsDetailsFragment) {
//                    fragmentTransaction.replace(R.id.contenedorCompartido, fragment).commit();
//                } else if (fragment instanceof UsersDetailsFragment) {
//                    fragmentTransaction.replace(R.id.contenedorCompartido, fragment).commit();
//                }
//            }
//        });
    }
}