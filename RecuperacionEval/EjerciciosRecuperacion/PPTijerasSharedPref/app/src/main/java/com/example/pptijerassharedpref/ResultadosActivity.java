package com.example.pptijerassharedpref;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pptijerassharedpref.ViewModels.ResultadosActivityVM;

import java.util.PriorityQueue;

public class ResultadosActivity extends AppCompatActivity {

    private TextView ptoPiedraGanado, ptoPapelGanado,  ptoTijerasGanado;
    private ResultadosActivityVM vm;
    private int ptoPiedra, ptoPapel, ptoTijeras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        ptoPiedraGanado = findViewById(R.id.ptoPiedraGanado);
        ptoPapelGanado = findViewById(R.id.ptoPapelGanado);
        ptoTijerasGanado = findViewById(R.id.ptoTijerasGanado);


        //Instancio VM
        vm = new ViewModelProvider(this).get(ResultadosActivityVM.class);

        SharedPreferences sharedPreferences = getSharedPreferences("archivo", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();



        int piedra = sharedPreferences.getInt("ptoPiedra", 0);
        int papel = sharedPreferences.getInt("ptoPapel", 0);
        int tijeras = sharedPreferences.getInt("ptoTijeras", 0);



//        ptoPiedraGanado.setText(Integer.toString(piedra));
//        ptoPapelGanado.setText(Integer.toString(papel));
//        ptoTijerasGanado.setText(Integer.toString(tijeras));


        vm.setPtosPiedraGanados(piedra);
        vm.setPtosPapelGanados(papel);
        vm.setPtosTijerasGanados(tijeras);

//
//        Cosas comentadas a ignorar:
//
//        Obtengo los datos de la actividad anterior

//        ptoPiedra = getIntent().getIntExtra("ptosPiedra", 0);
//        ptoPapel = getIntent().getIntExtra("ptosPapel", 0);
//        ptoTijeras = getIntent().getIntExtra("ptosTijeras", 0);
//        ptoPiedraGanado.setText(Integer.toString(ptoPiedra)); //Si lo dejo así no se me pierde el valor al girarlo


        //Paso los valores obtenidos al VM
//        vm.setPtosPiedraGanados(ptoPiedra);
//        vm.setPtosPapelGanados(ptoPapel);
//        vm.setPtosTijerasGanados(ptoTijeras);


        final Observer<Integer> resultadoObserverPiedra = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {

                ptoPiedraGanado.setText(Integer.toString(integer));
            }
        };
        vm.getPtosPiedraGanados().observe(this, resultadoObserverPiedra);


        final Observer<Integer> resultadoOberverPapel = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                ptoPapelGanado.setText(Integer.toString(integer));
            }
        };

        vm.getPtosPapelGanados().observe(this, resultadoOberverPapel);

        final Observer<Integer> resultadoOberverTijeras = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                ptoTijerasGanado.setText(Integer.toString(integer));
            }
        };

        vm.getPtosTijerasGanados().observe(this, resultadoOberverTijeras);

    }
}
