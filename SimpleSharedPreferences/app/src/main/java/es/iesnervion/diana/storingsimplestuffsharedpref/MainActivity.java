package es.iesnervion.diana.storingsimplestuffsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    SharedPreferences userDetails;

    EditText txtNombre;
    EditText txtApellido;
    TextView nombreObtenido;
    TextView apellidoObtenido;
    Button btnLogin;

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
        * */

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        showDataFromSharedPreferences();
    }

    public void saveInSharedPreferences(){
        //Get the instance
        //Can be opened only from this app
        userDetails = getApplicationContext().getSharedPreferences("userDetails", MODE_PRIVATE);

        //Save values in SharedPreferences
        Editor edit = userDetails.edit();
        edit.putString("username", txtNombre.getText().toString().trim()); //trim() removes spaces at the begginning and the end of the sentence of the string
        edit.putString("userSurname", txtApellido.getText().toString().trim());
        //commit the changes from Editor to SharedPreferences
        edit.apply();

//        //Now, let's retrieve saved values from preference
//        String nombre = userDetails.getString("username", "default name");
//        String apellido = userDetails.getString("userSurname", "default surname");
//
//        nombreObtenido.setText(nombre);
//        apellidoObtenido.setText(apellido);
    }

    public void showDataFromSharedPreferences(){

        //Now, let's retrieve saved values from preference
        String nombre = userDetails.getString("username", " ");
        String apellido = userDetails.getString("userSurname", " ");

        nombreObtenido.setText(nombre);
        apellidoObtenido.setText(apellido);
    }
}
