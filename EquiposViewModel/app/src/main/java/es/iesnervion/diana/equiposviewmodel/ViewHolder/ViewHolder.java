package es.iesnervion.diana.equiposviewmodel.ViewHolder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder {

    ImageView imagenEquipo;
    TextView  nombreEquipo;

    public ViewHolder(ImageView imagenEquipo, TextView nombreEquipo){
        this.imagenEquipo = imagenEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    public ImageView getImagenEquipo() {
        return imagenEquipo;
    }

    public void setImagenEquipo(ImageView imagenEquipo) {
        this.imagenEquipo = imagenEquipo;
    }

    public TextView getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(TextView nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
}
