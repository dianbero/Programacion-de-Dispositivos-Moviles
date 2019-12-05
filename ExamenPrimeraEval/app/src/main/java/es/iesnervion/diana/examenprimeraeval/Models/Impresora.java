package es.iesnervion.diana.examenprimeraeval.Models;

public class Impresora extends Producto {

    private String tipo;

    public Impresora(String nombreProducto, int fotoProducto, boolean isStock, String tipo) {
        super(nombreProducto, fotoProducto, isStock);
        this.tipo = tipo;
    }

    //Getters and Setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
