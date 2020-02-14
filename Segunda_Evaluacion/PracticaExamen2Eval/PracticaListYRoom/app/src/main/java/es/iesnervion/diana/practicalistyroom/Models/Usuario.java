package es.iesnervion.diana.practicalistyroom.Models;

public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String password;

    public Usuario() {
        this.id = 1;
        this.nombre = "Diana";
        this.apellido = "Bejarano";
        this.edad = 26;
        this.password = "123";
    }

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Usuario(int id, String nombre, String apellido, int edad, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
