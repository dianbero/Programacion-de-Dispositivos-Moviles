package es.iesnervion.diana.tryreproductor;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.List;

import es.iesnervion.diana.tryreproductor.Adapters.AdapterCanciones;
import es.iesnervion.diana.tryreproductor.Clases.Canciones;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView listaCanciones;
    Button btnPlay, btnStop, btnNext, btnPrevious;
    MediaPlayer musicPlayer;

    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        //setContentView(R.layout.activity_list_view_canciones);

        //listaCanciones = findViewById(R.id.listViewCanciones);
        //String[] canciones = {"Canción 1","Canción 2","Canción 3","Canción 4", "Canción 5", "Canció 6", "Canción 7"};

        //Para implementación lista sencilla, con layout preestablecido de Android
        /*String[] canciones = new String[20];
        for(int i=0; i<canciones.length;i++){
            canciones[i] = "Canción " + Integer.toString(i);
        }*/

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, canciones); //Usando el preestablecido de Android
        //listaCanciones.setAdapter(adapter);

        //Implementación de lista con adaptador personalizado
        ArrayList<Canciones> arrayListaCanciones = obtenerCanciones();

        listaCanciones = (ListView) findViewById(R.layout.activity_list_view_canciones);
        AdapterCanciones adapterCanciones = new AdapterCanciones(this, arrayListaCanciones);


        //Implementación de Reproductor

        //Inicializar clase MediaPlayer asociada al archivo de audio
        //musicPlayer = MediaPlayer.create(this, R.id.Alicia_Keys_In_Common); //Probar  cambiar nombre de archivo sin espacios y volverlos a copiar

        //Instanciar botones
        /*btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);*/

        //Asignación de eventos a los botones
        /*btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);*/

        //Practicar el reciclaje e inflater, etc

    }

    @Override
    public void onClick(View view) {
        /*switch (view.getId()){
            case R.id.btnPlay:
                musicPlayer.start();
                break;
            case R.id.btnStop:
                musicPlayer.stop();
                break;

        }*/
    }

    //Método para crear ArrayList de Canciones y obtenerlas
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)//Controlar versión de android (Buscar más información sobre ello)
    private ArrayList<Canciones> obtenerCanciones(){

        ArrayList<Canciones> canciones = new ArrayList<Canciones>();

        canciones.add(new Canciones("Supertrouper", "ABBA"));
        canciones.add(new Canciones("Bad Gay", "Billie Eillish"));
        canciones.add(new Canciones("In Common", "Alicia Keys"));

        /*canciones.add(new Canciones("Supertrouper", "ABBA", getDrawable(R.drawable.icono_imagen)));
        canciones.add(new Canciones("Bad Gay", "Billie Eillish", getDrawable(R.drawable.icono_imagen)));
        canciones.add(new Canciones("In Common", "Alicia Keys", getDrawable(R.drawable.icono_imagen)));*/

        return canciones;
    }
}
