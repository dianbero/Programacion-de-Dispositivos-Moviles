package es.iesnervion.diana.nbaroom.ElementosLista.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Entities.Jugador;
import es.iesnervion.diana.nbaroom.R;

/*Help to implemente adapter for lists:
* https://code.tutsplus.com/es/tutorials/android-from-scratch-understanding-adapters-and-adapter-views--cms-26646
* */
public class AdapterEquipo extends ArrayAdapter<Equipo> {

    public AdapterEquipo(@NonNull Context context, int resource, @NonNull ArrayList<Equipo> listaEquipos) {
        super(context, resource, listaEquipos);

    }

    public View getView(int position, View convertView, ViewGroup parent){
        Equipo equipo = getItem(position);
        ImageView x;

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fila_equipos,null,false);
        }

        ImageView vistaNombre = (ImageView) convertView.findViewById(R.id.imgEquipo);
        TextView nombreEquipo = (TextView) convertView.findViewById(R.id.nombreEquipo);




    }






}
