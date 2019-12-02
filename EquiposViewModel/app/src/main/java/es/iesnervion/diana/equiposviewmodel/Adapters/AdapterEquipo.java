package es.iesnervion.diana.equiposviewmodel.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.diana.equiposviewmodel.Models.Equipo;
import es.iesnervion.diana.equiposviewmodel.R;

public class AdapterEquipo extends BaseAdapter {

    private Context context;
    private ArrayList<Equipo> equipoArrayList;

//    public AdapterEquipo(Context context, ArrayList<Equipo> equipoArrayList){
//        this.context = context;
//        this.equipoArrayList = equipoArrayList;
//    }



    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
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
