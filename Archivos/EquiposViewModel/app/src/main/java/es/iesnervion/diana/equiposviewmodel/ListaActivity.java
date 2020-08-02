package es.iesnervion.diana.equiposviewmodel;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListaActivity extends AppCompatActivity {

    //Atributos
    ListView lista;
    TextView nombreEquipo;
    ImageView imagenEquipo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = findViewById(R.id.listaEquipos);
        nombreEquipo = findViewById(R.id.nombreEquipo);
        imagenEquipo = findViewById(R.id.imagenEquipo);
    }

}
