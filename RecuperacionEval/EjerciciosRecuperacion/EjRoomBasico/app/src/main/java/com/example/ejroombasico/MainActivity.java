package com.example.ejroombasico;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ejroombasico.DataBase.AppDataBase;
import com.example.ejroombasico.DataBase.AppDataBase_Impl;
import com.example.ejroombasico.Entidades.Usuario;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText tNombre, tEdad;
    private Button btnGuardar, btnVerDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tNombre = findViewById(R.id.txtNombre);
        tEdad = findViewById(R.id.txtEdad);

        btnGuardar = findViewById(R.id.btnGuardar);
        btnVerDatos = findViewById(R.id.btnDatos);

        btnGuardar.setOnClickListener(this);
        btnVerDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnGuardar:
                guardarUsuario();
                break;

            case R.id.btnDatos:
                irAVerDatos();
                break;
        }

    }

    /**
     * Método que obtiene los datos de la vista y los guarda en la BBDD
     */
    private void guardarUsuario(){
        //Obtener usuario de los editText
        //Guardar usuario en BBDD Room

        //Paso los datos obtenidos del formulario al objeto
        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombreUsuario(tNombre.getText().toString());
        nuevoUsuario.setEdadUsuario(Integer.parseInt(tEdad.getText().toString()));

        //Instancio la AppdataBase (La BBDD)
//        AppDataBase db = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "UsuariosDB").allowMainThreadQueries().build();
        AppDataBase.getDataBase(getApplicationContext()).usuarioDao().addUsuario(nuevoUsuario);

        //Guardo el objeto en la BBDD
//        db.usuarioDao().addUsuario(nuevoUsuario);
        Toast.makeText(getApplicationContext(), "Usuario guardado correctamente", Toast.LENGTH_SHORT).show();
    }

    /**
     * Método que contiene el intent para ir a la actividad de ver datos
     */
    private void irAVerDatos(){
        Intent intent = new Intent(this, Datos.class);
        startActivity(intent);
    }
}
