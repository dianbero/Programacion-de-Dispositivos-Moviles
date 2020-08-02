package es.iesnervion.diana.examen2eval.Models;

//@Entity(tableName = "Atleta")
public class Atleta {

//    @PrimaryKey
    private String nombre;
//    @ColumnInfo(name = "apellido")
    private String apellido;
//    @ColumnInfo(name = "observaciones")
    private String observaciones;

    public Atleta(String nombre, String apellido, String observaciones) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.observaciones = observaciones;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
