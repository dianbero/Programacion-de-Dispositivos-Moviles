package es.iesnervion.diana.storingsimplestuffsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

//    SharedPreferences userDetails;

    EditText txtNombre;
    EditText txtApellido;
    TextView nombreObtenido;
    TextView apellidoObtenido;
    Button btnLogin;


    /*Tal y como está ahora la app, lo que se escribe se mantiene en
     * los campos de escritura al cerrar la app, demasiado simple, pero hace eso*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = (EditText)findViewById(R.id.escribirNombre);
        txtApellido = (EditText) findViewById(R.id.escribirApellido);
        nombreObtenido = (TextView) findViewById(R.id.txtNombreObtenido);
        apellidoObtenido = (TextView) findViewById(R.id.txtApellidoObtenido);

        /*I'm working with this tutorial:
        * https://stackoverflow.com/questions/5950043/how-to-use-getsharedpreferences-in-android
        *
        * Finally i used this one:
        * https://www.geeksforgeeks.org/shared-preferences-in-android-with-examples/
        */


        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
//        showDataFromSharedPreferences();
        finish();

    }

    protected void onResume(){
        super.onResume();
        SharedPreferences sh = getSharedPreferences("shared", MODE_PRIVATE);
        String nombre = sh.getString("nombre", "");
        String apellido = sh.getString("apellido", "");
        txtNombre.setText(nombre);
        txtApellido.setText(apellido);
    }

    protected void onPause(){
        super.onPause();
        SharedPreferences sh = getSharedPreferences("shared", MODE_PRIVATE);
        SharedPreferences.Editor editor = sh.edit();
        editor.putString("nombre", txtNombre.getText().toString());
        editor.putString("apellido", txtApellido.getText().toString());
//
//        editor.putString("nombre", nombreObtenido.getText().toString());
//        editor.putString("apellido", apellidoObtenido.getText().toString());

        editor.commit();

    }

//    public void saveInSharedPreferences(){
//        //Get the instance
//        //Can be opened only from this app
////        userDetails = getApplicationContext().getSharedPreferences("userDetails", MODE_APPEND);
//        //Save values in SharedPreferences
//        Editor edit = userDetails.edit();
//        edit.putString("username", txtNombre.getText().toString().trim()); //trim() removes spaces at the begginning and the end of the sentence of the string
//        edit.putString("userSurname", txtApellido.getText().toString().trim());
//        //commit the changes from Editor to SharedPreferences
//        edit.apply();
//        Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_LONG).show();
//
////        //Now, let's retrieve the saved values from preference
////        String nombre = userDetails.getString("username", "default name");
////        String apellido = userDetails.getString("userSurname", "default surname");
////
////        nombreObtenido.setText(nombre);
////        apellidoObtenido.setText(apellido);
//    }
//
//    public void showDataFromSharedPreferences(){
//
//        //Now, let's retrieve saved values from preference
//        String nombre = userDetails.getString("username", " ");
//        String apellido = userDetails.getString("userSurname", " ");
//
//        nombreObtenido.setText(nombre);
//        apellidoObtenido.setText(apellido);
//    }
}
