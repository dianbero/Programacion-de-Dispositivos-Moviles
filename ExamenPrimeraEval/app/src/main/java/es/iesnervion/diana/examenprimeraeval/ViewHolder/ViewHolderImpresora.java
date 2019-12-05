package es.iesnervion.diana.examenprimeraeval.ViewHolder;

import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolderImpresora {

    private ImageView imagenDisponibilidad;
    private ImageView imagenImpresora;
    private TextView nombreImpresora;
    private ImageView tipoImpresora;

    public ViewHolderImpresora(ImageView imagenDisponibilidad, ImageView imagenOrdenador, TextView nombreOrdenador, ImageView tipoImpresora){
        this.imagenDisponibilidad = imagenDisponibilidad;
        this.imagenImpresora = imagenOrdenador;
        this.nombreImpresora = nombreOrdenador;
        this.tipoImpresora = tipoImpresora;
    }
    

    //Getters y Setters

    public ImageView getImagenDisponibilidad() {
        return imagenDisponibilidad;
    }

    public void setImagenDisponibilidad(ImageView imagenDisponibilidad) {
        this.imagenDisponibilidad = imagenDisponibilidad;
    }

    public ImageView getImagenImpresora() {
        return imagenImpresora;
    }

    public void setImagenImpresora(ImageView imagenImpresora) {
        this.imagenImpresora = imagenImpresora;
    }

    public TextView getNombreImpresora() {
        return nombreImpresora;
    }

    public void setNombreImpresora(TextView nombreImpresora) {
        this.nombreImpresora = nombreImpresora;
    }

    public ImageView getTipoImpresora() {
        return tipoImpresora;
    }

    public void setTipoImpresora(ImageView tipoImpresora) {
        this.tipoImpresora = tipoImpresora;
    }
}
