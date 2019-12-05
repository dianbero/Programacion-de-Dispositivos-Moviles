package com.example.nba.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nba.Clases.Jugador;
import com.example.nba.R;
import com.example.nba.ViewHolder.ViewHolderJugador;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorJugador extends BaseAdapter {
    private List<Jugador> jugadores;
    private Context c;
    private Jugador j;

    public AdaptadorJugador(Context c, ArrayList<Jugador> j) {
       jugadores = j;
       this.c = c;
    }

    @Override
    public int getCount() {
        return jugadores.size();
    }

    @Override
    public Object getItem(int i) {
        return jugadores.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View row = view;
        ViewHolderJugador holder;
        TextView posicion;
        TextView nombre;
        ImageView dorsal;
        j = (Jugador) getItem(i);

        if (row==null){
            //row=LayoutInflater.from(getContext()).inflate(R.layout.rowequipo, parent, false);
            LayoutInflater inflater = LayoutInflater.from(c);
            row=inflater.inflate(R.layout.rowjugador, viewGroup, false);

            dorsal = row.findViewById(R.id.dorsal);
            nombre = row.findViewById(R.id.nombreJugador);
            posicion = row.findViewById(R.id.posicion);

            holder = new ViewHolderJugador (dorsal,nombre, posicion);
            row.setTag(holder);
        }
        else{
            holder = (ViewHolderJugador) row.getTag();
        }

        holder.getNombre().setText(j.getNombre());
        holder.getPosicion().setText(j.getPosicion());
        holder.getDorsal().setBackgroundResource(j.getDorsal());

        return(row);
        }
    }

//    class ViewHolder {
//        TextView nombre;
//        ImageView dorsal;
//        TextView posicion;
//
//        ViewHolder (ImageView dorsal, TextView nombre, TextView posicion){
//            this.dorsal = dorsal;
//            this.nombre = nombre;
//            this.posicion = posicion;
//        }
//
//        public TextView getNombre() {
//            return nombre;
//        }
//
//        public ImageView getDorsal() {
//            return dorsal;
//        }
//
//        public TextView getPosicion() {
//            return posicion;
//        }
//}


