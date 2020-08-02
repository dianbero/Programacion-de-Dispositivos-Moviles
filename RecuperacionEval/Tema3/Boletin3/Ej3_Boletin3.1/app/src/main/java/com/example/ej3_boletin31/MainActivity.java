package com.example.ej3_boletin31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
/*EJERCICIO 3

Diseña una aplicación que permita que el usuario introduzca un texto y además disponga de dos botones:
 "Alinear izquierda" y "Alinear derecha", que alineen el texto a la izquierda y a la derecha respectivamente.
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alignLeft(View view) {
        //Alinea el texto introducido a la izquierda
    }

    public void alignRight(View view) {
        //Alinea el texto introducido a la izquierda
    }
}
