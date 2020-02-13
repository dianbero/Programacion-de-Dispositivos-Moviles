package com.example.ejbasico1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    EditText simpleEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = new Button(this);
        boton.setOnClickListener(this);
        setContentView(boton);

        simpleEditText = (EditText)findViewById(R.id.Pedir_datos);
        simpleEditText.setBackgroundColor(Color.BLACK);



    }


        /*@Override
        public void onClick(View view) {
            if (simpleEditText.getText().toString() != null)//check whether the entered text is not null
            {
                Toast.makeText(getApplicationContext(), simpleEditText.getText().toString(), Toast.LENGTH_LONG).show();//display the text that you entered in edit text
            }
*/

    @Override
    public void onClick(View v) {
        //sumar();
        if(simpleEditText.getText().toString() != null){

        }
    }

    public void sumar(){
        int suma = introducirValores() + introducirValores();
        boton.setText(suma);

    }

    public int introducirValores(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        return num;
    }



}
