package es.iesnervion.diana.a2examen2eval.Adapters;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import es.iesnervion.diana.a2examen2eval.Models.Atleta;
import es.iesnervion.diana.a2examen2eval.R;
import es.iesnervion.diana.a2examen2eval.ViewHolder.ViewHolderAtleta;

public class AtletaAdapter extends ArrayAdapter<Atleta> {

    public AtletaAdapter(@NonNull Context context, int resource, ArrayList<Atleta> listaAtletas) {
        super(context, resource, listaAtletas);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolderAtleta viewHolderAtleta;
        TextView nombreAtleta;

        Atleta atleta = getItem(position);

        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_atletas, parent, false);

            nombreAtleta = (TextView) convertView.findViewById(R.id.txtNombreAtleta);

            viewHolderAtleta = new ViewHolderAtleta(nombreAtleta);

            convertView.setTag(viewHolderAtleta);
        } else {
            viewHolderAtleta = (ViewHolderAtleta) convertView.getTag();
        }

        viewHolderAtleta.getTxtNombreAtleta().setText(atleta.getNombre());

        return convertView;
    }
}
