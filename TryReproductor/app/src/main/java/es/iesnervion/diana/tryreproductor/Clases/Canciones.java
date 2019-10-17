package es.iesnervion.diana.tryreproductor.Clases;

public class Canciones {

    private String titulo;
    private String artista;

    public Canciones(){
        this.titulo = "Default title";
        this.artista = "Defaul artist";
    }

    public Canciones(String titulo, String artista){
        this.titulo = titulo;
        this.artista = artista;
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
}
