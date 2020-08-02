package com.example.basicroomensegundoplano;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import android.os.Bundle;
import android.widget.TextView;

import com.example.basicroomensegundoplano.API.ApiDBResources;
import com.example.basicroomensegundoplano.DataBase.AppDataBase;
import com.example.basicroomensegundoplano.Entities.User;
import com.example.basicroomensegundoplano.ViewModelFactories.InfoActivityVMFactory;
import com.example.basicroomensegundoplano.ViewModels.InfoActivityVM;

public class DatosActivity extends AppCompatActivity {

    private TextView name;
    private TextView age;
    private InfoActivityVM vm;
    private InfoActivityVMFactory vmFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);

        name = findViewById(R.id.tNombre);
        age = findViewById(R.id.tEdad);
        vmFactory = new InfoActivityVMFactory(getApplication());


        //Instancio el VM
//        ApiDBResources f = new ApiDBResources(getApplication());

//        User user = AppDataBase.getDataBase(getApplicationContext()).userDao().getLastUserNoLIveData();
//
//        name.setText(user.getName());
//        age.setText(Integer.toString(user.getAge()));


        vm = new ViewModelProvider(this, vmFactory).get(InfoActivityVM.class);
//
//        //Observa los datos del último usuario y actualiza la vista
        vm.getLastUser().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                name.setText(user.getName());
                age.setText(Integer.toString(user.getAge()));
            }
        });


        //TODO llamada al task de ver datos


    }
}