package com.example.practicalistas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

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
        setContentView(R.layout.activity_main);

        //Construir la fuente de datos
        ArrayList<Usuario> listaUsuarios = new ListaUsuarios().getListaUsuarios();
        //Crea el adapter para convertir el array a las vistas
        UsuarioAdapter adapterUsuario = new UsuarioAdapter(this,0,listaUsuarios);
        //Incluir adapter en ListView
        ListView listView = (ListView) findViewById(R.id.listaUsuario);
        listView.setAdapter(adapterUsuario);

    }
}
