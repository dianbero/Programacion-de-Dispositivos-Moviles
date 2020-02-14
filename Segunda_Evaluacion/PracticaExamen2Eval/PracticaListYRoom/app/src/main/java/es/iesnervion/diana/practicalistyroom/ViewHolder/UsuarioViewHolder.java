package es.iesnervion.diana.practicalistyroom.ViewHolder;

import android.widget.TextView;

public class UsuarioViewHolder {
    //Aquí van los elementos que irán en la vista

    private TextView nombre;
    private TextView edad;


    public UsuarioViewHolder(TextView nombre, TextView edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getEdad() {
        return edad;
    }

    public void setEdad(TextView edad) {
        this.edad = edad;
    }
}
