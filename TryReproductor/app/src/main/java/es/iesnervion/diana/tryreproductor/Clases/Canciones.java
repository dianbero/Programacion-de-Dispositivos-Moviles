package es.iesnervion.diana.tryreproductor.Clases;

import android.graphics.drawable.Drawable;

import es.iesnervion.diana.tryreproductor.R;

import static androidx.core.content.res.TypedArrayUtils.getDrawable;

public class Canciones {

    private String titulo;
    private String artista;
    private Drawable imagenCancion;

    public Canciones(){
        this.titulo = "Default title";
        this.artista = "Default artist";
        //this.imagenCancion = Drawable.get //getDrawable(R.drawable.icono_imagen);
    }

    public Canciones(String titulo, String artista, Drawable archivoCancion){
        this.titulo = titulo;
        this.artista = artista;
        this.imagenCancion = archivoCancion;
    }

    //Getters and Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {

        return artista;
    }
    public void setArtista(String artista) {

        this.artista = artista;
    }

    public Drawable getImagenCancion(){
        return imagenCancion;
    }
    public void setImagenCancion(Drawable imagenCancion){
        this.imagenCancion = imagenCancion;
    }
}
