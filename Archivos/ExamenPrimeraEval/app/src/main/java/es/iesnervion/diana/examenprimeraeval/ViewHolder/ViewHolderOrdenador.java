package es.iesnervion.diana.examenprimeraeval.ViewHolder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderOrdenador {

    private ImageView imagenDisponibilidad;
    private ImageView imagenOrdenador;
    private TextView nombreOrdenador;
    private ImageView imagenCPU;

    public ViewHolderOrdenador(ImageView imagenDisponibilidad, ImageView imagenOrdenador, TextView nombreOrdenador, ImageView imagenCPU){
        this.imagenDisponibilidad = imagenDisponibilidad;
        this.imagenOrdenador = imagenOrdenador;
        this.nombreOrdenador = nombreOrdenador;
        this.imagenCPU = imagenCPU;
    }


    //Getters y Setters

    public ImageView getImagenDisponibilidad() {
        return imagenDisponibilidad;
    }

    public void setImagenDisponibilidad(ImageView imagenDisponibilidad) {
        this.imagenDisponibilidad = imagenDisponibilidad;
    }

    public ImageView getImagenOrdenador() {
        return imagenOrdenador;
    }

    public void setImagenOrdenador(ImageView imagenOrdenador) {
        this.imagenOrdenador = imagenOrdenador;
    }

    public TextView getNombreOrdenador() {
        return nombreOrdenador;
    }

    public void setNombreOrdenador(TextView nombreOrdenador) {
        this.nombreOrdenador = nombreOrdenador;
    }

    public ImageView getImagenCPU() {
        return imagenCPU;
    }

    public void setImagenCPU(ImageView imagenCPU) {
        this.imagenCPU = imagenCPU;
    }
}
