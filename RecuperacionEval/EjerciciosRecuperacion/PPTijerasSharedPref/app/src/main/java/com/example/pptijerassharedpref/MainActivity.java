package com.example.pptijerassharedpref;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.pptijerassharedpref.ViewModels.MainActivityVM;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnPiedra, btnPapel, btnTijeras;
    private int[] listadoBotones = {R.id.btnPiedra, R.id.btnPapel, R.id.btnTijeras};
    private TextView textoResultado;
    private Button btnResultados;
    private MainActivityVM vm;
    private Context application = getApplication();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPiedra = findViewById(R.id.btnPiedra);
        btnPapel = findViewById(R.id.btnPapel);
        btnTijeras = findViewById(R.id.btnTijeras);
        textoResultado = findViewById(R.id.textoResultado);
        btnResultados = findViewById(R.id.btnResultados);

        //Instancio ViewModel
        vm = new ViewModelProvider(this).get(MainActivityVM.class);
        //Para que cuando gire la pantalla recupere el dato guardado en el VM
        textoResultado.setText(vm.getTextoResultado());


        //Asigno evento a los botones
        btnPiedra.setOnClickListener(this);
        btnPapel.setOnClickListener(this);
        btnTijeras.setOnClickListener(this);
        btnResultados.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int btnRandom = generarBotonRandom();
        String resultado = "";
//        int ptosPiedra = 0, ptosPapel = 0, ptosTijeras = 0;

        //Inicializo el intent para ir a segunda actividad
        Intent intent = new Intent(this, ResultadosActivity.class);

        SharedPreferences sharedPreferences = getApplication().getSharedPreferences("archivo", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        //En función de quién gane muestra un texto y suma posición
        switch (v.getId()) {
            case R.id.btnPiedra:

                if (btnRandom == R.id.btnPapel) {
                    resultado = "Perdiste";
                } else if (btnRandom == R.id.btnTijeras) {
                    resultado = "Ganaste!";
                    //Suma punto
                    vm.setPtoPiedra(vm.getPtoPiedra() + 1);
//                    editor.putInt("ptoPiedra", vm.getPtoPiedra());
                } else {
                    resultado = "Empate";
                }
                break;
            case R.id.btnPapel:
                if (btnRandom == R.id.btnPiedra) {
                    resultado = "Ganaste!";
                    //Suma punto
                    vm.setPtoPapel(vm.getPtoPapel() + 1);
//                    editor.putInt("ptoPapel", vm.getPtoPapel());
                } else if (btnRandom == R.id.btnTijeras) {
                    resultado = "Perdiste!";
                } else {
                    resultado = "Empate";
                }
                break;

            case R.id.btnTijeras:
                if (btnRandom == R.id.btnPapel) {
                    resultado = "Ganaste!";
                    //Suma punto
                    vm.setPtoTijeras(vm.getPtoTijeras() + 1);
//                    editor.putInt("ptoTijeras", vm.getPtoTijeras());
                } else if (btnRandom == R.id.btnPiedra) {
                    resultado = "Perdiste!";
                } else {
                    resultado = "Empate";
                }
                break;

            case R.id.btnResultados:
                //Viaja a segunda actividad
//                intent.putExtra("ptosPiedra", vm.getPtoPiedra());
//                intent.putExtra("ptosPapel", vm.getPtoPapel());
//                intent.putExtra("ptosTijeras", vm.getPtoTijeras());

//                SharedPreferences sharedPreferences = getPreferences(Context.MODE_PRIVATE);

                //Le paso los datos al editor

                editor.putInt("ptoPiedra", vm.getPtoPiedra());
                editor.putInt("ptoPapel", vm.getPtoPapel());
                editor.putInt("ptoTijeras", vm.getPtoTijeras());
//                editor.putInt("ptoPiedra", vm.getPtoPiedra());
//                editor.putInt("ptoPapel", vm.getPtoPapel());
//                editor.putInt("ptoTijeras", vm.getPtoTijeras());

                editor.commit();

                startActivity(intent);
                break;
        }

        //Añado texto a vm
        vm.setTextoResultado(resultado);
        //Asigno a la vista el resultado obtenido
        textoResultado.setText(vm.getTextoResultado());

    }


    /**
     * Método que devuelve el id de un botón aleatorio del listado
     *
     * @return id del botón obtenido
     */
    private int generarBotonRandom() {
        Random random = new Random();
        int posicionBoton = random.nextInt(3);
        return listadoBotones[posicionBoton];
    }
}
