package com.example.contar10conviewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.contar10conviewmodel.Tasks.ContarHasta10Task;
import com.example.contar10conviewmodel.ViewModels.ContarHasta10ViewModel;

/**
 * NOTA:
 * Este ejercicio además de utilizar ViewModel está corregido respecto al otro de ContarHasta10
 * haciendo un uso correcto de AsyncTask
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnContar;
    private TextView txtCuenta;
    private ContarHasta10ViewModel vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtCuenta = findViewById(R.id.cuenta);
        btnContar = findViewById(R.id.btnContar);

        //Instancio el ViewModel
        vm = new ViewModelProvider(this).get(ContarHasta10ViewModel.class);

        //Hago que la vista observe los cambios relativos al texto
        final Observer<Integer> cuentaObserver = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                txtCuenta.setText(Integer.toString(integer));
            }
        };

        vm.getNumero().observe(this, cuentaObserver);

        Observer<Boolean> botonObserver = new Observer<Boolean>() {
            @Override
            public void onChanged(Boolean botonActivado) {
                if (botonActivado) {
                    btnContar.setEnabled(true);
                } else {
                    btnContar.setEnabled(false);
                }
            }
        };

        vm.getBotonActivado().observe(this, botonObserver);

        btnContar.setOnClickListener(this);
    }

    /**
     * Método que ejecuta el evento lanzado por el botón
     * Inicia el task para contar
     *
     * @param v el elemento de la vista que lanza la acción, en este caso el correspondiente al botón de contar
     */
    @Override
    public void onClick(View v) {
        new ContarHasta10Task(this, vm).execute(11); //Para que cuente hasta 10
    }
}