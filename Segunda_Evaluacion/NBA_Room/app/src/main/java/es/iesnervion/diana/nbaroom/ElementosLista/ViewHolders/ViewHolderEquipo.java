package es.iesnervion.diana.nbaroom.ElementosLista.ViewHolders;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderEquipo {

    private ImageView imagen;
    private TextView nombre;

    public ViewHolderEquipo(ImageView imagen, TextView nombre){
        this.imagen = imagen;
        this.nombre = nombre;
    }

    //Getters and Setters

    public ImageView getImagen() {
        return imagen;
    }

    public void setImagen(ImageView imagen) {
        this.imagen = imagen;
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }
}
