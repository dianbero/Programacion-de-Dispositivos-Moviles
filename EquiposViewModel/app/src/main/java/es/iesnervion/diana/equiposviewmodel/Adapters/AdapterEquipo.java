package es.iesnervion.diana.equiposviewmodel.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.diana.equiposviewmodel.Models.Equipo;
import es.iesnervion.diana.equiposviewmodel.R;

public class AdapterEquipo extends ArrayAdapter<Equipo> {

    public AdapterEquipo(Context context, ArrayList<Equipo> equipos){
        super(context, 0, equipos);
    }

    public View getView(int posicion, View convertView, ViewGroup parent){

        //Coge el elemento por su posición
        Equipo equipo = getItem(posicion);

        //Comprueba si una vista existente está siendo usada, si no, infla la vista
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.lista_layout, parent, false);
        }

        //Coloca los subelementos de cada elementos de la lista
        TextView nombreEquipo = (TextView) convertView.findViewById(R.id.nombreEquipo);
        ImageView imagenEquipo = (ImageView) convertView.findViewById(R.id.imagenEquipo);

        //Llena la vista con los datos  usando el modelo
        nombreEquipo.setText(equipo.getNombreEquipo());
        imagenEquipo.setImageLevel(equipo.getImagenEquipo());

        //Devuelve la vista completa
        return convertView;
    }


}
