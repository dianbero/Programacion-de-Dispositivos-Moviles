package com.example.basicroomensegundoplano.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.basicroomensegundoplano.API.ApiDBResources;
import com.example.basicroomensegundoplano.Entities.User;

/**
 * Este VM lo comparten ambas actividades. No es lo más correcto, lo más estrictamente correcto
 * sería que cada actividad tuviera su propio VM, en caso de fuera fragments sí lo haría así.
 * Pero bueno, no era eso lo más importante a probar con este ejercicio,
 * lo que quería probar ya sale, al fín. Mientras sepa la forma correcta de hacer las cosas,
 * todoo más o menos correcto.
 */
public class InfoActivityVM extends AndroidViewModel {
    //Private attributes
    private LiveData<User> lastUser;
    private ApiDBResources apiRepository;

    public InfoActivityVM(@NonNull Application application) {
        super(application);
        this.apiRepository = new ApiDBResources(application);
        this.lastUser = apiRepository.getLastUser();

    }

    //Es como si fuesen los getters y setters
    //En este caso el set
    public void insertUser(User user){
        apiRepository.insertUser(user);
    }

    //En este caso el get
    public LiveData<User> getLastUser() {
        return lastUser;
    }
}
