package com.example.basicroomensegundoplano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.basicroomensegundoplano.API.ApiDBResources;
import com.example.basicroomensegundoplano.Entities.User;
import com.example.basicroomensegundoplano.ViewModelFactories.InfoActivityVMFactory;
import com.example.basicroomensegundoplano.ViewModels.InfoActivityVM;
import com.example.basicroomensegundoplano.ViewModels.MainActivityVM;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText name;
    private EditText age;
    private Button btnSave;
    private Button btnInfo;
    private InfoActivityVM vm;
    private InfoActivityVMFactory vmFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.txtNombre);
        age = findViewById(R.id.txtEdad);
        btnSave = findViewById(R.id.btnGuardar);
        btnInfo = findViewById(R.id.btnDatos);
        //Instancio el VM


        btnSave.setOnClickListener(this);
        btnInfo.setOnClickListener(this);

    }

    /**
     * Método que en función del botón pulsado, realizará una determinada acción
     * - btnGuardar: guarda los datos introducidos en la BBDD
     * - btnDatos: viaja a la vista para ver los datos del último usuario introducido
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnGuardar:
                //TODO hacer llamada al método del task
                insertUser();
                break;
            case R.id.btnDatos:
                seeUserInfo();
                break;
        }
    }

    private void insertUser() {
        //Obtengo los datos de las entradas y se las paso a un nuevo objeto User creado
        String userName = name.getText().toString();
        int userAge;

        //Si el campo de edad no se ha completado o no es un número se indica -1 para comprobar
        // campos correctos
        try {
            userAge = Integer.parseInt(age.getText().toString());
        } catch (NumberFormatException e) {
            userAge = -1;
        }

        //Si ninguno de los campos son correctos o no se han completado, lo indica un mensaje
        if (userName.trim().isEmpty() || userAge == -1) {
            Toast.makeText(this, "Complete the spaces", Toast.LENGTH_SHORT).show();
        } else {
            User newUser = new User(userName, userAge);


            //Guardo lo datos de nuevo usuario
            vmFactory = new InfoActivityVMFactory(getApplication());
            vm = new ViewModelProvider(this, vmFactory).get(InfoActivityVM.class);
            vm.insertUser(newUser);

//        ApiDBResources df = new ApiDBResources(getApplication());
//        df.insertUser(newUser);
        }



    }

    /**
     * Método que permite viajar a la actividad de los datos del usuario
     */
    private void seeUserInfo() {
        Intent intent = new Intent(this, DatosActivity.class);
        startActivity(intent);
    }
}