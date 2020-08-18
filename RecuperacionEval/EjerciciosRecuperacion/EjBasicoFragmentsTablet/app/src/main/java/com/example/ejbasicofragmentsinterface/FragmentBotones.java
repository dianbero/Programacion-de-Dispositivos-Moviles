package com.example.ejbasicofragmentsinterface;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ejbasicofragmentsinterface.ViewModels.FragmentsSharedViewModel;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentBotones extends Fragment implements View.OnClickListener {

    private Button boton1;
    private Button boton2;
    private FragmentsSharedViewModel vm;
    private Fragment fragmentDetalles;

    public FragmentBotones() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //Contiene los elementos de la vista del fragment
        View view = inflater.inflate(R.layout.fragment_fragment_botones, container, false);

        //Instancio el ViewModel
        vm = new ViewModelProvider(requireActivity()).get(FragmentsSharedViewModel.class); //Uso requireActivity() en lugar de 'this',
                                                                                        // porque es lo que devuelve la vista del fragment,
                                                                                        // para fragments tengo siempre que usar ese método en lugar de 'this'

        //Instancio elementos de la vista
        boton1 = view.findViewById(R.id.boton1);
        boton2 = view.findViewById(R.id.boton2);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        //Pasa al ViewModel el texto correspondiente al botón pulsado
        switch (v.getId()) {
            case R.id.boton1:
                vm.setTextoAMostrar("Soy el botón 1");
                break;
            case R.id.boton2:
                vm.setTextoAMostrar("Soy el botón 2");
                break;
        }

        //Correción, esto no se hace aquí, porque el fragment debe ser independiente
//        //Si no es tablet, sustituye el fragment compartido
//        if(!vm.isTablet()){
//            fragmentDetalles = new FragmentDetalles();
//            FragmentManager frgManager2 = getFragmentManager(); //Porque no me aceptaba el getSupportFragmentManager()
//            FragmentTransaction frgTransaction2 = frgManager2.beginTransaction();
//            frgTransaction2.replace(R.id.fragmentCompartido, fragmentDetalles);
//            //Para que vuelva al fragment de botones
//            frgTransaction2.addToBackStack(null);
//            frgTransaction2.commit();
//        }

    }
}
