package es.iesnervion.diana.tryreproductor.Adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

import es.iesnervion.diana.tryreproductor.Clases.Canciones;
import es.iesnervion.diana.tryreproductor.R;

public class AdapterCanciones extends BaseAdapter {

    private Activity actividad;
    private ArrayList<Canciones> arrayListCanciones;

    public AdapterCanciones(Activity actividad, ArrayList<Canciones> arrayListCanciones){
        this.actividad = actividad;
        this.arrayListCanciones = arrayListCanciones;
    }

    @Override
    public int getCount() {
        //Devuelve la cancitdad de elementos(canciones) del arrayList, que son la cantidad de elementos que contiene el adapter
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
    public View getView(int i, View view, ViewGroup viewGroup)// muestra los elementos dentro del ListView
    {
        //Crea inflater para cada layout de cada fila de lista (cada ListView)
        if(view == null){
            //resource: Se le pasa id del layout a cargar(inflar), root: view a la que se acopla el recuso como hijo si el attachRoot es True, attachToRoot: ser o no ser padre del recurso infladdo
            view = LayoutInflater.from(actividad).inflate(R.layout.activity_list_view_canciones, viewGroup, false);
        }
        return view;
    }
}
