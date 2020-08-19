package com.example.ejexamenatletas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Toast;


import com.example.ejexamenatletas.ApiRepository.ApiDbRepository;
import com.example.ejexamenatletas.Fragments.DetailsFragment;
import com.example.ejexamenatletas.Fragments.ElectionFragment;
import com.example.ejexamenatletas.Fragments.InsertionFragment;
import com.example.ejexamenatletas.Fragments.ListAthletesFragment;
import com.example.ejexamenatletas.ViewModels.MainActivityVM;
import com.example.ejexamenatletas.ViewModels.ViewModelFactories.MainActivityVMFactory;

public class MainActivity extends AppCompatActivity {

    private MainActivityVM vm;
    private MainActivityVMFactory factory;
    private DetailsFragment detailsFragment;
    private ElectionFragment electionFragment;
    private InsertionFragment insertionFragment;
    private ListAthletesFragment listAthletesFragment;
    private ApiDbRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializo la factory
        factory = new MainActivityVMFactory(getApplication());
        //Inicializo el VM con el factory
        vm = new ViewModelProvider(this).get(MainActivityVM.class);

        // Indico si es tablet o no
        vm.setTablet(isTablet()); //Esto se podría hacer directamente en el VM, creo

        // Instancio el repository
        repository = new ApiDbRepository(getApplication());


        vm.isTablet().observe(this, new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean isTablet) {
                // Comprobamos si es tablet o no y hacemos el resto de las operaciones
                if (isTablet) {
                    //Implementar para tablet

                    //Fragment Inserción
                    insertionFragment = new InsertionFragment(repository);
                    getSupportFragmentManager().beginTransaction().add(R.id.fragmentTabletInsert, insertionFragment).commit();
                    //Fragment Listado
                    listAthletesFragment = new ListAthletesFragment();
                    getSupportFragmentManager().beginTransaction().add(R.id.fragmentTabletList, listAthletesFragment).commit();
                    //Fragment Detalles
                    openDetailsFragmentPhone(R.id.fragmentTabletDetails);

                } else {
                    //Implementar para móvil

                    //Inicializo election Fragment primero pasándole el factory necesario para le VM, para que elija el botón
                    electionFragment = new ElectionFragment(factory);
                    getSupportFragmentManager().beginTransaction().add(R.id.contenedorCompartido, electionFragment).commit();
                    //Dentro del fragment habrá elegido uno y ahora observo el vm, para ver cual ha elegido y abri el fragment elegido


                    //Observo el string del botón que ha sido seleccionado y abro el fragment correspondiente
                    abrirFragmentsMovil();
                    //Observo el elemento seleccionado y abro sus detalles
                    openDetailsFragmentPhone(R.id.contenedorCompartido);
                }

            }
        });

    }

    /**
     * Método que abre el correspondiente fragment observando el texto del botón seleccionado
     */
    private void abrirFragmentsMovil() {

        vm.getSelectedBotomName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                switch (s) {
                    case "insert":
                        //TODO abrir fragment inserción
                        insertionFragment = new InsertionFragment(repository);
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorCompartido, insertionFragment).addToBackStack(null).commit();
                        break;
                    case "list":
                        //TODO abrir fragment listado de atletas
                        listAthletesFragment = new ListAthletesFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorCompartido, listAthletesFragment).addToBackStack(null).commit();

//                        openDetailsFragmentPhone(R.id.contenedorCompartido); //Esto va mal: hace que al intentar ir al segundo fragment,
                                                                                //tras haber estado en todos, se vaya directamente al tercero
                                                                                //Puede que se trastoque al observar dentro de otro observable

                        break;

                }
            }
        });
    }


    /**
     * Método que abre el fragmento de detalles observando el entero de la posición del elemento seleccionado
     * de la lista.
     * @param idContainer id del contentedor UI en el que se va a mostrar dependiento de si es un móvil o tablet
     */
    private void openDetailsFragmentPhone(final int idContainer) {
            vm.getElementPosition().observe(this, new Observer<Integer>() {
                @Override
                public void onChanged(Integer integer) {
                    detailsFragment = new DetailsFragment(integer);
                    getSupportFragmentManager().beginTransaction().replace(idContainer, detailsFragment).addToBackStack(null).commit();

                }
            });
    }

    /**
     * Método que comprueba si el dispositivo es un móvil o una tablet,
     * esta es la forma que recomiendan, supuestamente la más acertada
     *
     * @return boolean que indica si es tablet o móvil
     */
    private boolean isTablet() {
        return (getApplicationContext().getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) > Configuration.SCREENLAYOUT_SIZE_LARGE;
    }


}