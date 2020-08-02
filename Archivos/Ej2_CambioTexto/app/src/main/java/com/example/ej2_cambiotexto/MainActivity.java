package com.example.ej2_cambiotexto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtFrase;
    CheckBox negrita, gigante, minuscula, colorRojo;
    Button botonAplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFrase = findViewById(R.id.frase);
        negrita = findViewById(R.id.chNegrita);
        gigante = findViewById(R.id.chGigante);
        minuscula = findViewById(R.id.chMinuscula);
        colorRojo = findViewById(R.id.chRojo);

        //botonAplicar = new Button(this);
        botonAplicar = findViewById(R.id.btnAplicar);
        botonAplicar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        //ColorStateList colorBase = txtFrase.getTextColors(); //Guarda color original para usarlo luego

        /*boolean minChecked = minuscula.isChecked();
        boolean giganteChecked = gigante.isChecked();*/

        if(negrita.isChecked()){
            txtFrase.setTypeface(txtFrase.getTypeface(), Typeface.BOLD);
        }else{
            txtFrase.setTypeface(null, Typeface.NORMAL);
        }
        if(gigante.isChecked()){ //Buscar la forma par que consiga directamente el tamaño del texto
            //minuscula.isChecked() = False;
            //minChecked = false;
            txtFrase.setTextSize(60);
        }else{
            txtFrase.setTextSize(20);
        }
        if(minuscula.isChecked()){
            //gigante.isChecked() = false;
            //giganteChecked = false;
            txtFrase.setTextSize(10);
        }else{
            txtFrase.setTextSize(20);
        }
        if(colorRojo.isChecked()){
            txtFrase.setTextColor(Color.RED);
        }else{
            txtFrase.setTextColor(Color.GRAY);
        }
    }


}
