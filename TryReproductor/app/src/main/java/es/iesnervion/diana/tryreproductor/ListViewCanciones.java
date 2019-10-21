package es.iesnervion.diana.tryreproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListViewCanciones extends AppCompatActivity {

    ListView listaCanciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_canciones);

        //listaCanciones = findViewById(R.id.listViewCanciones);

        String[] canciones = {"Canción 1","Canción 2","Canción 3"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, canciones);


        listaCanciones.setAdapter(adapter);



    }
}
