package es.iesnervion.diana.a2examen2eval.DAO;

import java.util.ArrayList;

import es.iesnervion.diana.a2examen2eval.Models.Atleta;

//@Dao
public interface AtletaDAO {

//    @Insert
    public void insertarAtleta();

//    @Query("SELECT * FROM Atletas")
    public ArrayList<Atleta> getListadoAtletas();

//    @Query("SELECT * FROM Atletas WHERE nombre = :nombreAtleta LIMIT 1")
    public Atleta getAtleta(String nombreAtleta);
}
