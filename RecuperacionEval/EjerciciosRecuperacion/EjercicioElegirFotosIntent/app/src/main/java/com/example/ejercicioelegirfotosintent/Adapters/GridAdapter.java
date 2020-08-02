package com.example.ejercicioelegirfotosintent.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import androidx.lifecycle.Observer;

import com.example.ejercicioelegirfotosintent.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapter extends BaseAdapter {

    private Context context;
//    private int[] listaFotos;
    private  ArrayList<Integer> listaFotos;
    private LayoutInflater inflater;
    private long id;

    public GridAdapter(Context context, ArrayList<Integer> listaFotos) {
        this.context = context;
        this.listaFotos = listaFotos;
    }

    @Override
    public int getCount() {
    return listaFotos.size();
}

    @Override
    public Object getItem(int position) {
        return listaFotos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.elemento_gridview, parent, false);
        }

        //Obtengo los elementos de la vista
        ImageView imagen = convertView.findViewById(R.id.foto_gridView);
        imagen.setImageResource(listaFotos.get(position));

        return convertView;
    }
}
