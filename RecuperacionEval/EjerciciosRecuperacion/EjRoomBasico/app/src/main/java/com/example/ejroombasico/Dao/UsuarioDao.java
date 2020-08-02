package com.example.ejroombasico.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.ejroombasico.Entidades.Usuario;

import java.util.List;

@Dao
public interface UsuarioDao {
//    @Query("SELECT * FROM Usuario WHERE idUsuario = :idUsuario")
//    Usuario getUsuario(int idUsuario);

    //Consulta que devuelve el último elemento registrado
    @Query("SELECT * FROM Usuario ORDER BY idUsuario DESC LIMIT 1;")
    Usuario getUltimoUsuario();

    @Insert
    void addUsuario(Usuario nuevoUsuario);
}
