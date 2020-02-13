package es.iesnervion.diana.a2examen2eval.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import es.iesnervion.diana.a2examen2eval.Adapters.AtletaAdapter;
import es.iesnervion.diana.a2examen2eval.Models.Atleta;
import es.iesnervion.diana.a2examen2eval.R;
import es.iesnervion.diana.a2examen2eval.Tools.ListaPruebaAdapterAtleta;

public class FragmentListado extends Fragment {


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

//        //Listado Atletas
//        ArrayList<Atleta> listaAtletas = new ListaPruebaAdapterAtleta().listaAtletas();
//        AtletaAdapter atletaAdapter = new AtletaAdapter(getContext(), 0, listaAtletas);
//
//        ListView listView = (ListView) findViewById(R.id.listaAtletas);
//        listView.setAdapter(atletaAdapter);

        return inflater.inflate(R.layout.fragment_listado, container,false);
    }

//    public static FragmentListado nuevoFragment(int num){
//        FragmentListado fragmentListado = new FragmentListado();

//        Bundle argumento = new Bundle();
//        argumento.putInt("numero", num);
//
//        fragmentListado.setArguments();
//
//        return fragmentListado;
//    }

}
