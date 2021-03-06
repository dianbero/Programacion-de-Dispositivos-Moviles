package es.iesnervion.diana.nbaroom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.ElementosLista.Adapter.AdapterEquipo;
import es.iesnervion.diana.nbaroom.ElementosLista.Tools.Tools;
import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Room.NBADataBase;

public class MainActivity extends AppCompatActivity{


    private ArrayList<Equipo> listaEquipos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Help:
        * Getting ready for Room:
        * https://developer.android.com/jetpack/androidx/releases/room?hl=es-419
        * cómo guardar contenido en BBDD con Room:
        * https://developer.android.com/training/data-storage/room
        * Steps to implement Room library:
        * https://android.jlelse.eu/5-steps-to-implement-room-persistence-library-in-android-47b10cd47b24
        * */

        Tools tools = new Tools();

        listaEquipos = tools.listaEquipos();
        //Instancio BD Room:
        NBADataBase db = Room.databaseBuilder(getApplicationContext(),NBADataBase.class,"NBARoom").build();

        //Instanciar listView
        ListView listView = (ListView) findViewById(R.id.listaquipos);
        //TODO revisar por qué falla
        //Pasa listView al Adapter
        AdapterEquipo adEquipo = new AdapterEquipo(this, R.layout.fila_equipos, listaEquipos);

    }


}
