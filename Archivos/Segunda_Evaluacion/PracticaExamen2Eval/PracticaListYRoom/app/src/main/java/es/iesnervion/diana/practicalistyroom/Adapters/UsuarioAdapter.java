package es.iesnervion.diana.practicalistyroom.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

import es.iesnervion.diana.practicalistyroom.Models.Usuario;
import es.iesnervion.diana.practicalistyroom.R;
import es.iesnervion.diana.practicalistyroom.ViewHolder.UsuarioViewHolder;

public class UsuarioAdapter extends ArrayAdapter<Usuario> {

    public UsuarioAdapter(@NonNull Context context, int resource, ArrayList<Usuario> listaUsuarios) {
        super(context, resource, listaUsuarios);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        //Con ViewHolder:

        //Declara ViewHolder
        //View lookup cache stored in tag
        UsuarioViewHolder usuarioViewHolder;

        //Declaro elementos para agregar a ViewHolder
        TextView nombre;
        TextView edad;

        //Obtiene los datos del elemento de la posición indicada
        Usuario usuario = getItem(position);

        //Comprueba si una vista existente está siendo usada, si no la "infla"
        if (convertView == null) {

            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_usuario, parent, false);

            //Instancio elementos para ViewHolder (busco los elementos para la vista)
            nombre = (TextView) convertView.findViewById(R.id.nombre);
            edad = (TextView) convertView.findViewById(R.id.edad);

            //Le paso los elementos al ViewHolder
            usuarioViewHolder = new UsuarioViewHolder(nombre, edad);

            // Cache the viewHolder object inside the nueva vista
            convertView.setTag(usuarioViewHolder);

        } else {
            //Vista está siendo reciclada, devuelve el objeto ViewHolder de tag
            usuarioViewHolder = (UsuarioViewHolder) convertView.getTag();
        }

        //Rellena los datos con los datos del objeto ViewHolder en la plantilla de la vista
        usuarioViewHolder.getNombre().setText(usuario.getNombre());
        usuarioViewHolder.getEdad().setText(Integer.toString(usuario.getEdad()));

        //Devuelve la vista completa para mostrar en pantalla

        return convertView;

    }
}


//        //Sin ViewHolder:
//        //Obtiene los datos del elemento de la posición indicada
//        Usuario usuario = getItem(position);
//
//        //Comprueba si una vista existente está siendo usada, si no la "infla"
//        if (convertView == null) {
//            //Si no hay vista para reutilizar, infla una nueva vista para la fila
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_usuario, parent, false);
//        }
//
//        //Buscar los datos para la vista
//        TextView nombre = (TextView) convertView.findViewById(R.id.nombre);
//        TextView edad = (TextView) convertView.findViewById((R.id.edad));
//
//        //Sin ViewHolder:
//        //Rellenar la vista con los datos
//        nombre.setText(usuario.getNombre());
//        edad.setText(Integer.toString(usuario.getEdad()));
//        return convertView;



