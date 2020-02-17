package es.iesnervion.diana.practicalistyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import es.iesnervion.diana.practicalistyroom.Activities.ListaUsuariosActivity;
import es.iesnervion.diana.practicalistyroom.Activities.PruebaFuncionamiento;
import es.iesnervion.diana.practicalistyroom.Models.Usuario;
import es.iesnervion.diana.practicalistyroom.Tools.ListaUsuarios;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre;
    EditText txtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO guardar datos insertados del login en la lista
        //TODO añadir otro botón al inicio para mostrar directamente la lista sin añadir nuevo usuario

        txtNombre = (EditText) findViewById(R.id.loginNombre);
        txtEdad = (EditText) findViewById(R.id.loginEdad);

    }

    public void login(View view) {

//        ArrayList<Usuario> lista =  guardarDatosEnLista();

        if (view.getId() == R.id.btnLogin) {
            Intent intent = new Intent(this, ListaUsuariosActivity.class);
//            intent.putExtra("lista", lista);
            startActivity(intent);
        }
    }

    public ArrayList<Usuario> guardarDatosEnLista() {
        String nombre = txtNombre.getText().toString();
        int edad = Integer.parseInt(txtEdad.getText().toString());

        return new ListaUsuarios().addNuevoUsuario(nombre, edad);
    }
}
