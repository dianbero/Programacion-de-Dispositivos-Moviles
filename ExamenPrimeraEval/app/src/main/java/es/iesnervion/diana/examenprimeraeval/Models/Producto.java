package es.iesnervion.diana.examenprimeraeval.Models;

public class Producto {

    //Atributos
    private String nombreProducto;
    private int fotoProducto;
    private boolean isStock;


    public Producto(String nombreProducto, int fotoProducto, boolean isStock){
        this.nombreProducto = nombreProducto;
        this.fotoProducto = fotoProducto;
        this.isStock = isStock;
    }

    //Getters and setters

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getFotoProducto() {
        return fotoProducto;
    }

    public void setFotoProducto(int fotoProducto) {
        this.fotoProducto = fotoProducto;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }
}
