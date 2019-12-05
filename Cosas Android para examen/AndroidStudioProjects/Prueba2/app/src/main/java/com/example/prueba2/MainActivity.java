package com.example.prueba2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = new Button(this);
        boton.setOnClickListener(this);
        setContentView(boton); //Muestra la acción del botón

    }


    @Override
    public void onClick(View v) {
        botonClic();
    }

    public void botonClic(){
        boton.setText("Hola Mundo");
    }
}
