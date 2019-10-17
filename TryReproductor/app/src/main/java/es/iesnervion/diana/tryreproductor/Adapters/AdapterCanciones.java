package es.iesnervion.diana.tryreproductor.Adapters;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

import es.iesnervion.diana.tryreproductor.Clases.Canciones;

public class AdapterCanciones extends BaseAdapter {

    private Activity actividad;
    private ArrayList<Canciones> arrayListCanciones;
    public AdapterCanciones(Activity actividad, ArrayList<Canciones> arrayListCanciones){
        this.actividad = actividad;
        this.arrayListCanciones = arrayListCanciones;
    }

    @Override
    public int getCount() {
        return arrayListCanciones.size();//Devuelve todas la canciones del arrayList
    }

    @Override
    public Object getItem(int posicion) {//Devuelve la lista de elementos del arrayList en la posicion especificada
        return arrayListCanciones.get(posicion);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
