package com.example.botonconfrase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = new Button(this);
        //boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
        setContentView(boton);
    }

    @Override
    public void onClick(View v) {
        //boton.setText(boton.getText().toString());
        boton.setText("Hi There");
    }
}
