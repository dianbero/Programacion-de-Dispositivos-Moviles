package es.iesnervion.diana.practicalistyroom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import es.iesnervion.diana.practicalistyroom.Activities.ListaUsuariosActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void login(View view) {
        Intent intent = new Intent(this, ListaUsuariosActivity.class);
        startActivity(intent);
    }
}
