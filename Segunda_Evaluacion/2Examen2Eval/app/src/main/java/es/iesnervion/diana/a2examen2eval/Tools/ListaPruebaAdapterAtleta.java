package es.iesnervion.diana.a2examen2eval.Tools;

import java.util.ArrayList;

import es.iesnervion.diana.a2examen2eval.Models.Atleta;

public class ListaPruebaAdapterAtleta {

    public ArrayList<Atleta> listaAtletas(){
        ArrayList<Atleta> atletas = new ArrayList<>();
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));
        atletas.add(new Atleta("Alberto", "Fernández", "Atleta joven"));

        return atletas;
    }
}
