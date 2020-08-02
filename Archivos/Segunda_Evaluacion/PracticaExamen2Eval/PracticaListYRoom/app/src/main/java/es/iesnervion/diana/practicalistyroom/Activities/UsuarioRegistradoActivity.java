package es.iesnervion.diana.practicalistyroom.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import es.iesnervion.diana.practicalistyroom.Models.Usuario;
import es.iesnervion.diana.practicalistyroom.R;
import es.iesnervion.diana.practicalistyroom.Tools.ListaUsuarios;

public class UsuarioRegistradoActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario_registrado);

        /*Help:
         * https://stackoverflow.com/questions/4186021/how-to-start-new-activity-on-button-click
         * */

        TextView txtNombre = (TextView) findViewById(R.id.txtNombre);
        TextView txtEdad = (TextView) findViewById(R.id.txtEdad);

        //Obtengo el intent
        Intent intent = getIntent();

        //Comprueba que tenga datos
        if (intent.getExtras() != null) {
            String nombre = intent.getStringExtra("nombre");
            int edad = intent.getIntExtra("edad", 22);

            //Paso los datos obtenidos del intent a los elementos de la vista
            txtNombre.setText(nombre);
            txtEdad.setText(Integer.toString(edad));
        }
    }

    /*
    * En esta aplicación este método no se usa
    * */
    public ArrayList<Usuario> guardarDatosEnLista() {
        //Obtengo el intent
        Intent intent = getIntent();
        String nombre = "";
        int edad = 0;
        ListaUsuarios operacion;
        ArrayList<Usuario> lista = null;

        if (intent.getExtras() != null) {
            nombre = intent.getStringExtra("nombre");
            edad = intent.getIntExtra("edad", 22);
            //Devuelve la lista con los nuevos datos
            operacion = new ListaUsuarios();
            lista = operacion.addNuevoUsuario(nombre, edad);
        }

        return lista;
    }

}


