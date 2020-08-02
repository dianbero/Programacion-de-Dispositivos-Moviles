package es.iesnervion.diana.equiposviewmodel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Atributos
    Button btnVerLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerLista = findViewById(R.id.btnVerLista);
        btnVerLista.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        intentVerLista();
    }

    public void intentVerLista(){
        Intent intentLista = new Intent(this, ListaActivity.class);
        startActivity(intentLista);
    }
}
