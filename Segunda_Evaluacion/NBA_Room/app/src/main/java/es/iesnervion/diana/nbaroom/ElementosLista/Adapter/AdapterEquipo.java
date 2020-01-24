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

import es.iesnervion.diana.nbaroom.ElementosLista.ViewHolders.ViewHolderEquipo;
import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Entities.Jugador;
import es.iesnervion.diana.nbaroom.R;

/*Help to implement adapter for lists:
* https://code.tutsplus.com/es/tutorials/android-from-scratch-understanding-adapters-and-adapter-views--cms-26646
* */
public class AdapterEquipo extends ArrayAdapter<Equipo> {

    public AdapterEquipo(@NonNull Context context, int resource, @NonNull ArrayList<Equipo> listaEquipos) {
        super(context, resource, listaEquipos);

    }

    public View getView(int position, View convertView, ViewGroup parent){ //position es el índice del ArrayList
        //Busca el elemento con el índice position en ArrayList<Equipo>
        Equipo equipo = getItem(position);
        ViewHolderEquipo equipoHolder;
        ImageView vistaNombre;
        TextView nombreEquipo;

        //Infla la fila sólo una vez
        if (convertView == null){

            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fila_equipos,null,false);

            vistaNombre = (ImageView) convertView.findViewById(R.id.imgEquipo);
            nombreEquipo = (TextView) convertView.findViewById(R.id.nombreEquipo);

            //Paso los elementos al viewHolder de Equipo
            equipoHolder = new ViewHolderEquipo(vistaNombre, nombreEquipo);

            equipoHolder.getNombre().setText(equipo.getNombre());
            equipoHolder.getImagen().setImageResource(equipo.getImagen());

            //Almacenar objeto VielHolder en convertView (resultados de findViewByID)
            convertView.setTag(equipoHolder);
        }





        return convertView;
    }






}
