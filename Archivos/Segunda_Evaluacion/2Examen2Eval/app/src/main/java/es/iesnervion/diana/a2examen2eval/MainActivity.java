package es.iesnervion.diana.a2examen2eval;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.diana.a2examen2eval.Adapters.AtletaAdapter;
import es.iesnervion.diana.a2examen2eval.Models.Atleta;
import es.iesnervion.diana.a2examen2eval.Tools.ListaPruebaAdapterAtleta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<Atleta> listaAtletas = new ListaPruebaAdapterAtleta().listaAtletas();
//        AtletaAdapter atletaAdapter = new AtletaAdapter(this, 0, listaAtletas);
//
//        ListView listView = (ListView) findViewById(R.id.litaAtletas);
//        listView.setAdapter(atletaAdapter);
    }
}
