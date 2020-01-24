package es.iesnervion.diana.nbaroom.ElementosLista.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.Entities.Jugador;

public class AdapterJugador extends ArrayAdapter<Jugador> {

    public AdapterJugador(@NonNull Context context, int resource, ArrayList<Jugador> listaJugadores) {
        super(context, resource, listaJugadores);
    }

    public View getView(int position, View converView, ViewGroup parent){
        //Buscar elemento en arrayList
        Jugador jugador = getItem(position);

    }
}
