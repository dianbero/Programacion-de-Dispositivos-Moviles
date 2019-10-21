package es.iesnervion.diana.tryreproductor.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import es.iesnervion.diana.tryreproductor.Clases.Canciones;
import es.iesnervion.diana.tryreproductor.R;

public class AdapterCanciones extends BaseAdapter {

    private Activity actividad;
    private ArrayList<Canciones> arrayListCanciones;//Fuente de datos para el adapter

    public AdapterCanciones(Activity actividad, ArrayList<Canciones> arrayListCanciones){
        this.actividad = actividad;
        this.arrayListCanciones = arrayListCanciones;
    }



    @Override
    public int getCount() {
        //Devuelve la cantidad de elementos(canciones) del arrayList, que son la cantidad de elementos que contiene el adapter
        return arrayListCanciones.size();
    }

    @Override
    public Object getItem(int posicion) {//Devuelve la lista de elementos del arrayList en la posicion especificada por parametro
        return arrayListCanciones.get(posicion);
    }

    @Override
    public long getItemId(int posicion) {//Devuelve el elemento seleccionado del arrayList

        return posicion;
    }

    @Override
    public View getView(int posicion, View vistaConvertida, ViewGroup viewGroup)// muestra los elementos dentro del ListView
    {
        View vista = view;
        //Crea inflater para cada layout de cada fila de lista (cada ListView)
<<<<<<< Updated upstream
        if(view == null){
            LayoutInflater inflater = LayoutInflater.from(actividad);
            //resource: Se le pasa id del layout a cargar(inflar), root: view a la que se acopla el recuso como hijo si el attachRoot es True, attachToRoot: ser o no ser padre del recurso infladdo
            //view = LayoutInflater.from(actividad).inflate(R.layout.activity_list_view_canciones, viewGroup, false);
            view = inflater.inflate(R.layout.activity_list_view_canciones, viewGroup, false);
=======
        if(vistaConvertida == null){
            //resource: Se le pasa id del layout a cargar(inflar), root: vistaConvertida a la que se acopla el recuso como hijo si el attachRoot es True, attachToRoot: ser o no ser padre del recurso infladdo
            vistaConvertida = LayoutInflater.from(actividad).inflate(R.layout.activity_list_view_canciones, viewGroup, false);
>>>>>>> Stashed changes
        }

        //Coge el elemento actual para mostrar
        Canciones cancionActual = (Canciones) getItem(posicion);


        //Coge la imagen, el titulo, y el artista
        ImageView imageViewElemento = (ImageView) vistaConvertida.findViewById(R.id.iconoImagen);
        TextView tituloElemento = (TextView) vistaConvertida.findViewById(R.id.txtTitulo);
        TextView artistaElemento = (TextView) vistaConvertida.findViewById(R.id.txtArtista);

        //Establece los textos y la imagen de los elementos
        tituloElemento.setText(cancionActual.getTitulo());
        artistaElemento.setText(cancionActual.getArtista());
        imageViewElemento.setImageDrawable(cancionActual.getImagenCancion());

        //Devuelve la vista para la fila actual
        return vistaConvertida;
    }
}
