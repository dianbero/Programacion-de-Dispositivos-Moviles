package es.iesnervion.diana.nbaroom;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.ElementosLista.Adapter.AdapterEquipo;
import es.iesnervion.diana.nbaroom.ElementosLista.Adapter.AdapterJugador;
import es.iesnervion.diana.nbaroom.ElementosLista.Tools.Tools;
import es.iesnervion.diana.nbaroom.Entities.Jugador;

public class JugadorActivity extends AppCompatActivity {
    private ArrayList<Jugador> jugadores;

    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.lista_jugadores);

        Tools tools = new Tools();

        jugadores = tools.listaJugadores();

        //Instancio DB Room:
        ListView listView = (ListView) findViewById(R.id.lista_jugadores);
        AdapterJugador adJugador= new AdapterJugador(this, R.layout.fila_jugador, jugadores);
        /*Hay que hacer que al pulsar un elemento de la lista se muestre en otra pantalla la lista
        * de los jugadores del equipo*/

    }







}
