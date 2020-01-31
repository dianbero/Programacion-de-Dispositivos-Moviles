package com.example.nba;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nba.Adaptadores.Adaptador;
import com.example.nba.Clases.Equipo;
import com.example.nba.Metodos.Metodos;

import java.util.ArrayList;


public class MainActivity extends ListActivity implements AdapterView.OnItemClickListener {

    /*private Integer[] images;
    private String[] nombres;
    private String[] conferencias;

     */
    private ArrayList<Equipo> equipos;
    /*
    Para el equipo foto, texto y conferencia
    Jugador dorsal, nombre, nacionalidad
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*
        Anhadir a los equipos en un arrayList y probar
         */
        equipos = Metodos.rellenarArrayList();


        /*
        images = new Integer[] {};
        nombres = new String[] {"Atlanta Hawks", "Charlotte Hornets", "Miami Heat", "Orlando Magic",
                "Whashington Wizards", "Boston Celtics", "New York Knicks", "Philadelphia 76ERS", "Toronto Raptors",
                "Chicago Bulls", "Cleveland Cavaliers", "Detroit Pistons", "Indiana Pacers", "Milwaukee Bucks",
                "Dallas Maverics", "Houston Rockets", "Memphis Grizzlies", "New Orleans Pelicans", "San Antonio Spurs",
                "Denver Nuggets", "Minnesota Timberwolves", "Oklahoma City Thunder", "Portland Trail Blazers",
                "Utah Jazz", "Atlanta Hawks", "Golden State Warriors", "LA Clippers", "Los Angeles Lakers",
                "Phoenix Suns", "Sacramento Kings"};
        conferencias = new String[] {"EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA", "EA",
                "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE", "WE"};

         */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = getListView();
        //setListAdapter(new Adaptador(this, R.layout.rowequipo, images, nombres, conferencias));
        setListAdapter(new Adaptador(this, R.layout.rowequipo, equipos));
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getApplicationContext(), JugadorActivity.class);
        intent.putExtra("id", i);
        startActivity(intent);

    }

}
