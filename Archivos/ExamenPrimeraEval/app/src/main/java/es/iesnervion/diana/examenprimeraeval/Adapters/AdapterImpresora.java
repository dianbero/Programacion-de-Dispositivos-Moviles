package es.iesnervion.diana.examenprimeraeval.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.diana.examenprimeraeval.Models.Impresora;
import es.iesnervion.diana.examenprimeraeval.R;
import es.iesnervion.diana.examenprimeraeval.ViewHolder.ViewHolderImpresora;

public class AdapterImpresora extends BaseAdapter {

    private ArrayList<Impresora> listaImpresoras;
    private Context context;

    @Override
    public int getCount() {
        return listaImpresoras.size();
    }

    @Override
    public Object getItem(int posicion) {
        return listaImpresoras.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {
        return posicion;
    }

    @Override
    public View getView(int posicion, View convertView, ViewGroup viewGroup) {
        ViewHolderImpresora holderImpresora = null;
        ImageView imagenDisponibilidad = null;
        ImageView imagenImpresora = null;
        TextView tipoImpresora = null;
        ImageView tipo = null;


        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.fila_impresora, viewGroup, false);

            Impresora impresoraActual = (Impresora) getItem(posicion);

            imagenDisponibilidad = (ImageView) convertView.findViewById(R.id.imgDisponibilidadImpr);
            imagenImpresora = (ImageView) convertView.findViewById(R.id.imgImpr);
            tipoImpresora = (TextView) convertView.findViewById(R.id.TVtipoImpr);


            imagenImpresora.setImageResource(impresoraActual.getFotoProducto());
            tipoImpresora.setText(impresoraActual.getNombreProducto());

            holderImpresora = new ViewHolderImpresora(imagenDisponibilidad, imagenImpresora, tipoImpresora, tipo);
            convertView.setTag(holderImpresora);


            if (listaImpresoras.get(posicion).isStock()) {
                imagenDisponibilidad.setImageResource(R.drawable.verde);
            }else {
                imagenDisponibilidad.setImageResource(R.drawable.rojo);
            }
        }

        holderImpresora.setImagenDisponibilidad(imagenDisponibilidad);
        holderImpresora.setImagenImpresora(imagenImpresora);
        holderImpresora.setNombreImpresora(tipoImpresora);
        holderImpresora.setTipoImpresora(tipo);

        return convertView;
    }
}
