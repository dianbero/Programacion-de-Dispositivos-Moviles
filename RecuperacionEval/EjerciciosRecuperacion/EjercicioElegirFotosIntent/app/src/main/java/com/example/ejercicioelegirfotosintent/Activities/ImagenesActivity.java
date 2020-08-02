package com.example.ejercicioelegirfotosintent.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.ejercicioelegirfotosintent.Adapters.GridAdapter;
import com.example.ejercicioelegirfotosintent.Models.Persona;
import com.example.ejercicioelegirfotosintent.R;
import com.example.ejercicioelegirfotosintent.Tools.ListasDatos;
import com.example.ejercicioelegirfotosintent.ViewModels.ImagenesActivityVM;

import java.util.ArrayList;
import java.util.List;

public class ImagenesActivity extends AppCompatActivity {

    private GridView gridView;
//    private int[] lista;
    private ArrayList<Integer> lista;
    private ImagenesActivityVM liveDataImagenesVM;
    private GridAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagenes_view);

        //Instancio ViewModel
        liveDataImagenesVM = new ViewModelProvider(this).get(ImagenesActivityVM.class);

        gridView = findViewById(R.id.gridView);

        //Creo el observer que actualiza la vista
        final Observer<ArrayList<Integer>> listaImagenesObserver = new Observer<ArrayList<Integer>>() {
            @Override
            public void onChanged(ArrayList<Integer> integers) {
                adapter = new GridAdapter(getApplicationContext(), integers);
                gridView.setAdapter(adapter);
            }
        };

        liveDataImagenesVM.getListaImagenesLiveData().observe(this, listaImagenesObserver);


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Intent intent = new Intent(ImagenesActivity.this, MainActivity.class); //Esto no hay que hacerlo porque sólo quiero obtener la respuesta para la actividad anterior

                //Creo un intent standard, simplemente para enviar la información requerida por la primera actividad
                Intent intent = new Intent();

                //Le paso como parámetro el elemento del ArrayList de la posición correspondiente
                Persona personaAux = new Persona();
                personaAux.setImagen(liveDataImagenesVM.getListaImagenes().get(position));
//
//                intent.putExtra("resultado", lista.get(position));
                intent.putExtra("resultado", personaAux);

                //Manda intent con respuesta
                setResult(Activity.RESULT_OK, intent);
//                startActivity(intent); //Esto lanza un nuevo intent y no es lo que hay que hacer
                finish();

            }
        });

    }
}
