package es.iesnervion.diana.practicalistyroom.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import es.iesnervion.diana.practicalistyroom.Adapters.UsuarioAdapter;
import es.iesnervion.diana.practicalistyroom.MainActivity;
import es.iesnervion.diana.practicalistyroom.Models.Usuario;
import es.iesnervion.diana.practicalistyroom.R;
import es.iesnervion.diana.practicalistyroom.Tools.ListaUsuarios;

public class ListaUsuariosActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_usuarios);

        //Creación de lista con datos:

        //Fuente de datos desdeArrayList
        ArrayList<Usuario> listaUsuarios = new ListaUsuarios().getListaUsuarios();
//        ArrayList<Usuario> listaUsuarios = guardarDatosEnLista();

        //Crear adapter para pasar arrayliest a la vista
        UsuarioAdapter adapterUsuario = new UsuarioAdapter(this, 0, listaUsuarios);

        //Instancia listview donde va el adapter
        ListView listView = (ListView) findViewById(R.id.listaUsuario);

        //Incluir adapter en listview
        listView.setAdapter(adapterUsuario);
    }

    public void volverALogin(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
