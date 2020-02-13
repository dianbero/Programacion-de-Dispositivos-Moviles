package com.example.practicalistas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.practicalistas.Adapters.UsuarioAdapter;
import com.example.practicalistas.Models.Usuario;
import com.example.practicalistas.Tools.ListaUsuarios;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /*Página de ayuda con listas:
     * https://github.com/codepath/android_guides/wiki/Using-an-ArrayAdapter-with-ListView*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

//        //Construir la fuente de datos
//        ArrayList<Usuario> listaUsuarios = new ListaUsuarios().getListaUsuarios();
//        //Crea el adapter para convertir el array a las vistas
//        UsuarioAdapter adapterUsuario = new UsuarioAdapter(this,0,listaUsuarios);
//        //Incluir adapter en ListView
//        ListView listView = (ListView) findViewById(R.id.listaUsuario);
//        listView.setAdapter(adapterUsuario);

        Button btn = (Button)findViewById(R.id.btnLogin);

    }


    public void login(View view) {
        Intent intent = new Intent(this, ListsActivity.class);
        startActivity(intent);
    }
}
