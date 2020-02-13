package es.iesnervion.diana.ej2_practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView frase;
    CheckBox negrita, gigante, minuscula, colorRojo;
    Button botonAplicar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frase = findViewById(R.id.frase);
        negrita = findViewById(R.id.chNegrita);
        gigante = findViewById(R.id.chGigante);
        minuscula = findViewById(R.id.chMinuscula);
        colorRojo = findViewById(R.id.chRojo);

        botonAplicar = new Button(this);
        botonAplicar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(negrita.isChecked()){

        }
        if(gigante.isChecked()){
            frase.setTextSize(30);
        if(minuscula.isChecked()){
            frase.setTextSize(10);
        }
        if(colorRojo.isChecked()){
            frase.setTextColor(Color.RED);
        }
    }
}
