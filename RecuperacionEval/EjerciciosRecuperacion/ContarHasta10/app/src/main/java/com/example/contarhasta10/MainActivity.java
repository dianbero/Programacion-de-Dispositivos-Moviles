package com.example.contarhasta10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Ejercicio que al pulsar un botón, cuenta hasta 10.
 * Va mostrando los números en pantalla, hasta 10.
 * Los números se van mostrando en la misma pantalla del botón, encima de éste.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnContar;
    private TextView txtCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtCuenta = findViewById(R.id.cuenta);
        btnContar = findViewById(R.id.btnContar);

        btnContar.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        for (int i = 0; i < 10; i++) {
            new ContarHasta10Task(this).execute(i);
        }
    }

}