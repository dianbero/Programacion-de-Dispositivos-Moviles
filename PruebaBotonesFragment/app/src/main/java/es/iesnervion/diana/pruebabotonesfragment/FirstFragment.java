package es.iesnervion.diana.pruebabotonesfragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {

    //Constructor vacío
    public FirstFragment(){

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Infla el layout para el fragmento
        return inflater.inflate(R.layout.first_fragment, container, false);

    }

    public static FirstFragment newInstance(int num){

        FirstFragment fragmento1 = new FirstFragment();

        Bundle argumento = new Bundle();
        argumento.putInt("numero", num);
        fragmento1.setArguments(argumento);

        return fragmento1;
    }




}
