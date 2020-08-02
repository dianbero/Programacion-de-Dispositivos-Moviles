package es.iesnervion.diana.examenprimeraeval.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.diana.examenprimeraeval.Models.Ordenador;
import es.iesnervion.diana.examenprimeraeval.R;
import es.iesnervion.diana.examenprimeraeval.ViewHolder.ViewHolderOrdenador;

public class AdapterOrdenador extends BaseAdapter {

    private ArrayList<Ordenador> listaOrdenadores;
    private Context context;



    public AdapterOrdenador(Context context, ArrayList<Ordenador> listaOrdenadores){
        this.context = context;
        this.listaOrdenadores = listaOrdenadores;
    }

    @Override
    public int getCount() {
        return listaOrdenadores.size();
    }

    @Override
    public Object getItem(int posicion) {
        return listaOrdenadores.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup viewGroup) {

        ViewHolderOrdenador holderOrdenador = null;
        ImageView imagenDisponibilidad = null;
        ImageView imagenOrdenador = null;
        TextView nombreOrdenador = null;
        ImageView imagenCPU = null;


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.fila_ordenador, viewGroup, false);

            Ordenador ordenadorActual = (Ordenador) getItem(posicion);

            imagenDisponibilidad = (ImageView) convertView.findViewById(R.id.imgDisponibilidadOrd);
            imagenOrdenador = (ImageView) convertView.findViewById(R.id.imgOrd);
            nombreOrdenador = (TextView) convertView.findViewById(R.id.TVnombreOrd);
            imagenCPU = (ImageView) convertView.findViewById(R.id.imgCPU);

            imagenOrdenador.setImageResource(ordenadorActual.getFotoProducto());
            nombreOrdenador.setText(ordenadorActual.getNombreProducto());

            holderOrdenador = new ViewHolderOrdenador(imagenDisponibilidad, imagenOrdenador, nombreOrdenador, imagenCPU);
            convertView.setTag(holderOrdenador);

            if (listaOrdenadores.get(posicion).isStock()) {
                imagenDisponibilidad.setImageResource(R.drawable.verde);
            }else {
                imagenDisponibilidad.setImageResource(R.drawable.rojo);
            }
        }


        holderOrdenador.setImagenDisponibilidad(imagenDisponibilidad);
        holderOrdenador.setImagenOrdenador(imagenOrdenador);
        holderOrdenador.setNombreOrdenador(nombreOrdenador);
        holderOrdenador.setImagenCPU(imagenCPU);

        return convertView;
    }
}
