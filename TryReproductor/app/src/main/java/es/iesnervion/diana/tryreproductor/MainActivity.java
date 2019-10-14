package es.iesnervion.diana.tryreproductor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ListView listaCanciones;
    Button btnPlay, btnStop, btnNext, btnPrevious;
    MediaPlayer musicPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ListView
        setContentView(R.layout.activity_list_view_canciones);

        listaCanciones = findViewById(R.id.listViewCanciones);
        //String[] canciones = {"Canción 1","Canción 2","Canción 3","Canción 4", "Canción 5", "Canció 6", "Canción 7"};

        String[] canciones = new String[20];
        for(int i=0; i<canciones.length;i++){
            canciones[i] = "Canción " + Integer.toString(i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, canciones);

        listaCanciones.setAdapter(adapter);



        //Implementación de Reproductor

        //Inicializar clase MediaPlayer asociada al archivo de audio
        musicPlayer = MediaPlayer.create(this, R.id.Alicia_Keys_In_Common); //Probar  cambiar nombre de archivo sin espacios y volverlos a copiar

        //Instanciar botones
        btnPlay = findViewById(R.id.btnPlay);
        btnStop = findViewById(R.id.btnStop);
        btnNext = findViewById(R.id.btnNext);
        btnPrevious = findViewById(R.id.btnPrevious);

        //Asignación de eventos a los botones
        btnPlay.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        btnPrevious.setOnClickListener(this);

        //Practicar el reciclaje e inflater, etc

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnPlay:
                musicPlayer.start();
                break;
            case R.id.btnStop:
                musicPlayer.stop();
                break;

        }
    }
}
