package com.example.ejroombasico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ejroombasico.DataBase.AppDataBase;
import com.example.ejroombasico.Entidades.Usuario;

public class Datos extends AppCompatActivity {

    private TextView tvNombre, tvEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        tvNombre = findViewById(R.id.tNombre);
        tvEdad = findViewById(R.id.tEdad);

//        AppDataBase db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "UsuariosDB").allowMainThreadQueries().build();
        Usuario usuario = AppDataBase.getDataBase(getApplicationContext()).usuarioDao().getUltimoUsuario();

//        Usuario usuario = db.usuarioDao().getUltimoUsuario();

        if (usuario != null) {
            tvNombre.setText(usuario.getNombreUsuario());
            tvEdad.setText(Integer.toString(usuario.getEdadUsuario()));
        }


    }
}
