package com.example.ejemplointernet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button boton;
    EditText num1, num2; //donde se introducen los números
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.txtNum1);
        num2 = (EditText) findViewById(R.id.txtNum2);
        resultado = (TextView) findViewById(R.id.resultado);

        //boton = new Button(this);
        boton = (Button) findViewById(R.id.btnCalcular);
        boton.setOnClickListener(this);
        //setContentView(boton);

    }

    @Override
    public void onClick(View v) {
        resultado.setText("Resultado de la suma: " + suma());
    }

    public int suma(){

            int n1 = Integer.parseInt(num1.getText().toString());
            int n2 = Integer.parseInt(num2.getText().toString());

        //Si utilizo float falla al realizar la suma
        /*float n1 = Float.parseFloat(num1.getText().toString());
        float n2 = Float.parseFloat(num1.getText().toString());*/

        return n1 + n2;
    }







}
