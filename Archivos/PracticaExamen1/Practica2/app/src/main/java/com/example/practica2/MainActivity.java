package com.example.practica2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity  {

    ImageView imagen;
//    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        imagen = findViewById(R.drawable.descarga);

    }

    public void sendMessage(View view) {
//        layout = (ConstraintLayout) findViewById(R.id.imagen);
//        View layout = findViewById(R.id.imagen);
        if(view.performClick()){
            imagen = (ImageView) findViewById(R.id.imagen);

        }

        Toast.makeText(this, "ÉXITO!!!", Toast.LENGTH_LONG).show();
    }

}
