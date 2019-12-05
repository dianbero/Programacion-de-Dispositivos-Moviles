package com.example.nba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.nba.Adaptadores.AdaptadorJugador;
import com.example.nba.Clases.Jugador;
import com.example.nba.Metodos.Metodos;

import java.util.ArrayList;


public class JugadorActivity extends AppCompatActivity {
    private ArrayList<Jugador> jugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Bundle datos = getIntent().getExtras();
        int id = datos.getInt("id");
        jugadores = Metodos.crearInicializarJugadores();
        jugadores = Metodos.rellenarArrayListJugadores(id, jugadores);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugador);
        AdaptadorJugador adapter = new AdaptadorJugador(getApplicationContext(), jugadores);
        ListView list = findViewById(R.id.listas);
        list.setAdapter(adapter);
    }
}
