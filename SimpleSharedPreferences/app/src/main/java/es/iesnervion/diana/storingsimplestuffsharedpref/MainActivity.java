package es.iesnervion.diana.storingsimplestuffsharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText txtNombre;
        EditText txtapellido;

        /*I'm working with this tutorial:
        * https://stackoverflow.com/questions/5950043/how-to-use-getsharedpreferences-in-android
        * */

        //Get the instance
        //Can be opened only from this app
        SharedPreferences userDetails = this.getSharedPreferences("userDetails", MODE_PRIVATE);

        //Save values in SharedPreferences
        Editor edit = userDetails.edit();
        edit.putString("username", );

    }
}
