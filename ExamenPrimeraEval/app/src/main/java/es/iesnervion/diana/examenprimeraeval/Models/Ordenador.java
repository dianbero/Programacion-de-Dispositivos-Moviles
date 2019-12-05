package es.iesnervion.diana.examenprimeraeval.Models;

public class Ordenador extends Producto {

    //Atributos
    private int logoProducto;


    public Ordenador(String nombreProducto, int fotoProducto, boolean isStock, int logoProducto){
        super(nombreProducto, fotoProducto, isStock);

        this.logoProducto = logoProducto;
    }

    //Getters and setters

    public int getLogoProducto() {
        return logoProducto;
    }

    public void setLogoProducto(int logoProducto) {
        this.logoProducto = logoProducto;
    }
}
