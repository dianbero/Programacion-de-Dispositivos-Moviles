package es.iesnervion.diana.practicalistyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

import es.iesnervion.diana.practicalistyroom.Activities.ListaUsuariosActivity;
import es.iesnervion.diana.practicalistyroom.Activities.PruebaFuncionamiento;
import es.iesnervion.diana.practicalistyroom.Activities.UsuarioRegistradoActivity;
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

//    public void login(View view) {
//
////        ArrayList<Usuario> lista =  guardarDatosEnLista();
//
//    }

    //Probando:
    public void login(View view) {
        Intent intent = new Intent(this, UsuarioRegistradoActivity.class);
        boolean isVacio;

        //Obtengo los datos de la vista
        String nombre = txtNombre.getText().toString();
        //Si la entrada de edad no está vacía lo asigna a un entero
        int edad = 0;
        boolean esNumero = true;
        boolean isEmpty = txtEdad.getText().toString().isEmpty();

        //Comprobar que lo introducido en textBox edad es un número
        try {
            edad = Integer.parseInt(txtEdad.getText().toString());
        } catch (Exception e) {
            esNumero = false;
        }

        //Si el nombre no está vacío
        if (!txtNombre.getText().toString().equals("")) {
            intent.putExtra("nombre", nombre);
        }
        //si está vacío
        else {
            //debe añadir edad y colorear en rojo
            txtEdad.setText("Must add an name");
            txtEdad.setTextColor(Color.RED);
        }

        //Si la edad no está vacía y es un número
        if (!isEmpty && esNumero) {
            intent.putExtra("edad", edad);
            //Empieza actividad con intent con Nombre y edad
            startActivity(intent);
        }
        //Si está vacía
        else if (isEmpty) {
            //Debe introducir un numero
            txtEdad.setText("Must add an age");
            txtEdad.setTextColor(Color.RED);
        }
        //Si no es un número
        else {
            //debe añadir un nombre
            txtEdad.setText("Must type a number");
            txtEdad.setTextColor(Color.RED);
        }


        ////////////////
//        if (!txtEdad.getText().toString().equals("")) {
//            edad = Integer.parseInt(txtEdad.getText().toString());
//            intent.putExtra("nombre", nombre);
//            intent.putExtra("edad", edad);
//            startActivity(intent);
//
//        } else {
//            txtEdad.setText("Must add an age");
//            txtEdad.setTextColor(Color.RED);
//        }
    }


    //    public ArrayList<Usuario> guardarDatosEnLista() {
//        String nombre = txtNombre.getText().toString();
//        int edad = Integer.parseInt(txtEdad.getText().toString());
//
//        return new ListaUsuarios().addNuevoUsuario(nombre, edad);
//    }
//
    public void verLista(View view) {
        //Si el id del elemento de la vista se corresponde con el del botón para ir a la vista de lista
        if (view.getId() == R.id.btnLista) {
            Intent intent = new Intent(this, ListaUsuariosActivity.class);
//            intent.putExtra("lista", lista);
            startActivity(intent);
        }
    }
}
