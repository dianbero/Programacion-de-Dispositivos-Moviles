package com.example.ejbasicofragmentsinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
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
    private FragmentsSharedViewModel vm;
    private FragmentBotones fragmentBotones;
    private FragmentDetalles fragmentDetalles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vm = new ViewModelProvider(this).get(FragmentsSharedViewModel.class);

        vm.setTablet(getResources().getBoolean(R.bool.isTablet));

        //También se puede hacer directamente con findViewBy de alguno de los Framelayout

        //Si es tablet carga los dos fragments (Botones y Detalles)
        if(vm.isTablet()){

            //Instancio los fragments programáticamente
            fragmentBotones = new FragmentBotones();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.add(R.id.frgBotones, fragmentBotones);
//            fragmentTransaction.commit();
            //Forma corta:
            getSupportFragmentManager().beginTransaction().add(R.id.frgBotones, fragmentBotones).commit();


            fragmentDetalles = new FragmentDetalles();
//            FragmentManager frgManager2 = getSupportFragmentManager();
//            FragmentTransaction frgTransaction2 = frgManager2.beginTransaction();
//            frgTransaction2.add(R.id.contenedor, fragmentDetalles);
//            frgTransaction2.commit();
            //Forma corta:
            getSupportFragmentManager().beginTransaction().add(R.id.contenedor, fragmentDetalles).commit();
        }
        //Si es móvil
        else
        {
            //Primero carga el fragment de botones
            fragmentBotones = new FragmentBotones();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//            fragmentTransaction.add(R.id.fragmentCompartido, fragmentBotones);
//            fragmentTransaction.commit();

            getSupportFragmentManager().beginTransaction().add(R.id.fragmentCompartido, fragmentBotones).commit();

            //Al pulsar el un botón cambia el texto, y muestra el fragment de detalles con el texto correspondiente al botón pulsado
            final Observer<String> observer = new Observer<String>() {
                @Override
                public void onChanged(String s) {
                    fragmentDetalles = new FragmentDetalles();
//                    FragmentManager frgManager2 = getSupportFragmentManager();
//                    FragmentTransaction frgTransaction2 = frgManager2.beginTransaction();
//                    frgTransaction2.replace(R.id.fragmentCompartido, fragmentDetalles);
//                    //Para que vuelva al fragment de botones
//                    frgTransaction2.addToBackStack(null);
//                    frgTransaction2.commit();

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentCompartido, fragmentDetalles).addToBackStack(null).commit();
                }
            };

            vm.getTextoAMostrar().observe(this, observer);

        }

    }

}
