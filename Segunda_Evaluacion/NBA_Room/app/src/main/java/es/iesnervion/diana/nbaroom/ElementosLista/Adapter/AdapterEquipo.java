package es.iesnervion.diana.nbaroom.ElementosLista.Adapter;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

import es.iesnervion.diana.nbaroom.Entities.Equipo;

public class AdapterEquipo extends ArrayAdapter<Equipo> {

    public AdapterEquipo(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public AdapterEquipo(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public AdapterEquipo(@NonNull Context context, int resource, @NonNull Equipo[] objects) {
        super(context, resource, objects);
    }

    public AdapterEquipo(@NonNull Context context, int resource, int textViewResourceId, @NonNull Equipo[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public AdapterEquipo(@NonNull Context context, int resource, @NonNull List<Equipo> objects) {
        super(context, resource, objects);
    }

    public AdapterEquipo(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Equipo> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
