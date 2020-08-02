package es.iesnervion.diana.nbaroom.ElementosLista.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.ElementosLista.ViewHolders.ViewHolderJugador;
import es.iesnervion.diana.nbaroom.Entities.Jugador;
import es.iesnervion.diana.nbaroom.R;

public class AdapterJugador extends ArrayAdapter<Jugador> {

    public AdapterJugador(@NonNull Context context, int resource, ArrayList<Jugador> listaJugadores) {
        super(context, resource, listaJugadores);
    }

    public View getView(int position, View converView, ViewGroup parent){
        //Buscar elemento en arrayList
        Jugador jugador = getItem(position);
        ViewHolderJugador jugadorholder = null;
        TextView nombreJugador;
        TextView posicionJugador;

        if(converView!=null){
            //Inflar la vista
        converView = LayoutInflater.from(getContext()).inflate(R.layout.fila_equipos, null, false);

        nombreJugador = (TextView) converView.findViewById(R.id.nombreEquipo);
        posicionJugador = (TextView) converView.findViewById(R.id.posicion);

        //Paso los elementos al viewholder de Jugadores
        jugadorholder = new ViewHolderJugador(nombreJugador, posicionJugador);

        //Almacena objeto ViewHolder en convertView (resultados de findViewById)
        converView.setTag(jugador);
        }

        jugadorholder.getNombre().setText(jugador.getNombre());
        jugadorholder.getPosicion().setText(jugador.getPosicion());

        return  converView;
    }
}
