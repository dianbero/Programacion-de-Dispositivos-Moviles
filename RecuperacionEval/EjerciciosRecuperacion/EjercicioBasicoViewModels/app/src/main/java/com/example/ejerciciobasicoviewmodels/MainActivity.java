package com.example.ejerciciobasicoviewmodels;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ejerciciobasicoviewmodels.ViewModels.PalabraViewModel;

public class MainActivity extends AppCompatActivity {

    //Instancio elementos de la vista
    TextView textView;
    Button boton;
    PalabraViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instancio mi clase ViewModel
        vm = new ViewModelProvider(this).get(PalabraViewModel.class);
        textView = (TextView)findViewById(R.id.textView);
        //Le asigno a textView el valor del ViewModel, si no hago esto, no funciona
        textView.setText(vm.getPalabra());
        boton = (Button)findViewById(R.id.btnVerPalabra);

    }

    public void verPalabra(View view) {
        //Modifico el valor del ViewModel
        vm.setPalabra("Soy un texto...!!!");
        textView.setText(vm.getPalabra());

        //Probar a hacerlo con LiveData o Mutable LiveData
    }
}
