package com.example.ejbasicofragmentsinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

import com.example.ejbasicofragmentsinterface.ViewModels.FragmentsSharedViewModel;

public class MainActivity extends AppCompatActivity  {
    /**
     * Aunque en el título del proyecto pone que está hecho con isterfaces, en realidad está
     * hecho con ViewModels
     */
    private Button boton1;
    private Button boton2;
    private Fragment fragmentBotones;
    private Fragment fragmentDetalles;
    private FragmentsSharedViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancio los fragments programáticamente
        fragmentBotones = new FragmentBotones();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frgBotones, fragmentBotones);
        fragmentTransaction.commit();

        fragmentDetalles = new FragmentDetalles();
        FragmentManager frgManager2 = getSupportFragmentManager();
        FragmentTransaction frgTransaction2 = frgManager2.beginTransaction();
        frgTransaction2.add(R.id.contenedor, fragmentDetalles);
        frgTransaction2.commit();

    }
}
