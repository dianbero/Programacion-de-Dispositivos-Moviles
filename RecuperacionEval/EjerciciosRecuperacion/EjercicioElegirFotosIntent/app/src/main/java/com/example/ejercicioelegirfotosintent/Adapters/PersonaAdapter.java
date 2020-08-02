package com.example.ejercicioelegirfotosintent.Adapters;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ejercicioelegirfotosintent.Models.Persona;
import com.example.ejercicioelegirfotosintent.R;
import com.example.ejercicioelegirfotosintent.ViewHolders.PersonaViewHolder;

import java.util.ArrayList;

public class PersonaAdapter extends BaseAdapter {

    //Atributos privados
    private Context context;
    private ArrayList<Persona> listaPersonas;

    //Constructor
//    public PersonaAdapter() {
////        this.context = context;
////        this.listaPersonas = listaPersonas;
//    }

    public PersonaAdapter(Context context, ArrayList<Persona> listaPersonas) {
        this.context = context;
        this.listaPersonas = listaPersonas;
    }

    //Métodos Adapter

    /**
     * Método qe indica cuántos datos se cargan, por lo que devuelve el tamaño del ArrayList
     * @return tamaño del ArrayList
     */
    @Override
    public int getCount() {
        return listaPersonas.size();
    }

    /**
     * Método que devuelve el elemento que se carga
     *
     * @param position, posición del elemento cargado
     * @return elemento al que corresponde la posicion indicada
     */
    @Override
    public Object getItem(int position) {
        return listaPersonas.get(position);
    }

    /**
     * Método que devuelve el id del elemento que se carga
     * @param position posición del elemento cargado
     * @return id del elemento cargado
     */
    @Override
    public long getItemId(int position) {
        return 0;
    }

    /**
     * Método que obtiene la vista de la fila que se carga con todos sus elementos
     * @param position posición del elemento
     * @param convertView vista a reciclar
     * @param parent vista padre
     * @return vista cargar con sus elementos
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Declaro ViewHolder
        PersonaViewHolder viewHolder;

        //Declaro elementos para agregar a ViewHolder
        ImageView imagen;
        TextView textoNombre;

        //Obtengo los datos de los elementos de la posición indicada
        Persona persona = (Persona) getItem(position);

        //Comprueba si una vista existente está siendo usada, si no, la infla
        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(R.layout.row_persona, parent, false);

            //Instancio los elementos de la vista
            imagen = (ImageView) convertView.findViewById(R.id.imagen);
            textoNombre = (TextView) convertView.findViewById(R.id.textoNombre);

            //Paso los elementos al viewHolder
            viewHolder = new PersonaViewHolder(textoNombre, imagen);

            //Asocio el ViewHolder a la vista
            convertView.setTag(viewHolder);

        } else {
            viewHolder = (PersonaViewHolder) convertView.getTag();
        }

        //Rellena los datos con los datos del ViewHolder
        viewHolder.getTexto().setText(persona.getNombre());
        viewHolder.getVistaImagen().setImageResource(persona.getImagen());

        //Devuelve la vista
        return convertView;
    }
}
