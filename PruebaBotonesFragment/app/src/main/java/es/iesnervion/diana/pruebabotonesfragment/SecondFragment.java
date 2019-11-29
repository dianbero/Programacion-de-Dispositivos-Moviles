package es.iesnervion.diana.pruebabotonesfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SecondFragment extends Fragment {

    //Constructor vacío
    public SecondFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Infla el layout para el fragmento
        return inflater.inflate(R.layout.second_fragment, container, false);
        //TODO: revisar que la vista es activity_main, creo que no, que tiene que ser la vista de un fragmento
    }
}
