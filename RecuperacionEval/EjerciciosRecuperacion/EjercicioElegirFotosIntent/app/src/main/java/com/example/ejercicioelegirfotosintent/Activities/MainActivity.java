package com.example.ejercicioelegirfotosintent.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ejercicioelegirfotosintent.Adapters.PersonaAdapter;
import com.example.ejercicioelegirfotosintent.Models.Persona;
import com.example.ejercicioelegirfotosintent.R;
import com.example.ejercicioelegirfotosintent.Tools.ListasDatos;
import com.example.ejercicioelegirfotosintent.ViewModels.MainActivityVM;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private PersonaAdapter adapter;
    static final int CODIGO_PETICION = 1;
    private ArrayList<Persona> listaPersonas;
    private int posicionAdapter;
    private MainActivityVM vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intancio el ViewModel
        vm = new ViewModelProvider(this).get(MainActivityVM.class);

        listView = findViewById(R.id.listView);

        /*Lo que tengo a continuación hacía que fallase por que al crearse nuevo la lista en el onCreate,
        * cada vez que volvía a esta pantalla, carga una nueva lista, y no la lista que ya tenía actualizada*/
                        //Obtengo la lista de datos
                //        listaPersonas = new ListasDatos().getListaPersonas();
                        //Paso la lista al viewModel
                //        vm.setListaPersonas(listaPersonas);
                        //Paso la lista  al liveData
                //        vm.setListaPersonasLiveData(listaPersonas);

        //Creo el observer que actualiza la vista
        final Observer<ArrayList<Persona>> listaPersonasObserver = new Observer<ArrayList<Persona>>() {
            @Override
            public void onChanged(ArrayList<Persona> personas) {
//                adapter = new PersonaAdapter(getApplicationContext(), personas); //Así las letras salen más claras
                adapter = new PersonaAdapter(getBaseContext(), personas);
                listView.setAdapter(adapter);
            }
        };



        vm.getListaPersonasMutable().observe(this, listaPersonasObserver);
//        vm.getListaPersonas().observe(this, listaPersonasObserver);

        //Acción al pulsar elemento de la lista
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Creo el intent
                Intent intent = new Intent(MainActivity.this, ImagenesActivity.class);
                intent.putExtra("posicion", position);

                startActivityForResult(intent, CODIGO_PETICION);

                posicionAdapter = position;
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODIGO_PETICION) {
            if (resultCode == RESULT_OK) {

                //Entero que representa la imagen obtenida de la actividad anterior
//                int seleccion = data.getIntExtra("resultado", 0);
                Persona personaAux = (Persona) data.getSerializableExtra("resultado");
                int seleccion = personaAux.getImagen();

                //TODO ponerlo a sólo el int de la imagen o un dato persona entero y que actualice esa persona en concreto
                ArrayList<Persona> aux = vm.getListaPersonas();
                aux.get(posicionAdapter).setImagen(seleccion);


                vm.setListaPersonasLiveData(aux);




                //Lo que hacía sin ViewModel:

                //Crea de nuevo el adapter y se le pasa de nuevo la lista de personas
//                adapter = new PersonaAdapter(this, listaPersonas);
//                //Se asocia de nuevo el adaptador al ListView
//                listView.setAdapter(adapter);

            }
        }
    }

}
