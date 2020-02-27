package es.iesnervion.diana.nowroom.DAOInterfaces;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

import es.iesnervion.diana.nowroom.Models.Usuario;

@Dao
public interface UsuarioDAO {
    @Insert
    public void insertUsuario(Usuario usuario);

    @Update
    public void updateUsuario(Usuario usuario);

    @Delete
    public void deleteUsuario(Usuario usuario);

    @Query("SELECT * FROM Usuarios")
    public ArrayList<Usuario> getAllUsuarios();

    @Query("SELECT * FROM usuarios WHERE id = :idUsuario LIMIT 1")
    public Usuario getUsuario(int idUsuario);
}
