package es.iesnervion.diana.practicalistyroom.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import es.iesnervion.diana.practicalistyroom.R;

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


    //Mostrar nombre y edad
}
