package es.iesnervion.diana.comprobacionfuncionamientolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import es.iesnervion.diana.comprobacionfuncionamientolist.Adapter.UsuarioAdapter;
import es.iesnervion.diana.comprobacionfuncionamientolist.Models.Usuario;
import es.iesnervion.diana.comprobacionfuncionamientolist.Tools.ListaUsuarios;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creación de lista con datos:

        //Fuente de datos desdeArrayList
        ArrayList<Usuario> listaUsuarios = new ListaUsuarios().getListaUsuarios();

        //Crear adapter para pasar arrayliest a la vista
        UsuarioAdapter adapterUsuario = new UsuarioAdapter(this, 0, listaUsuarios);

        //Instancia listview donde va el adapter
        ListView listView = (ListView) findViewById(R.id.listaUsuario);

        //Incluir adapter en listview
        listView.setAdapter(adapterUsuario);
    }
}
