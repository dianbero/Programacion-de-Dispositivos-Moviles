package es.iesnervion.diana.examenprimeraeval.Listas;

import java.util.ArrayList;

import es.iesnervion.diana.examenprimeraeval.Models.Impresora;
import es.iesnervion.diana.examenprimeraeval.Models.Ordenador;
import es.iesnervion.diana.examenprimeraeval.R;

public class ListasProductos {


    private ArrayList<Ordenador> listaCompletaOrdenadores(){
        Ordenador ord1 = new Ordenador("Acer A315", R.drawable.acera315, true, R.drawable.intel);
        Ordenador ord2 = new Ordenador("Acer A515", R.drawable.acera515, false, R.drawable.amd);
        Ordenador ord3 = new Ordenador("HP 255 G7", R.drawable.hp255g7, false, R.drawable.intel);
        Ordenador ord4 = new Ordenador("Lenovo Ideapad S340", R.drawable.ideapads340, true, R.drawable.amd);
        Ordenador ord5 = new Ordenador("Lenovo 81 N3", R.drawable.lenovo81n3, true, R.drawable.amd);
        Ordenador ord6 = new Ordenador("MSI 047 XES", R.drawable.msi047xes, false, R.drawable.intel);

        ArrayList<Ordenador> listaOrdenadores = new ArrayList<Ordenador>();

        listaOrdenadores.add(ord1);
        listaOrdenadores.add(ord2);
        listaOrdenadores.add(ord3);
        listaOrdenadores.add(ord4);
        listaOrdenadores.add(ord5);
        listaOrdenadores.add(ord6);

        return listaOrdenadores;
    }

    private ArrayList<Impresora> listaCompletaImpresoras(){
        Impresora impr1 = new Impresora("HP 5010", R.drawable.hp5010, true, "Tinta");
        Impresora impr2 = new Impresora("Canon TS 705", R.drawable.canonts705, true, "Láser");
        Impresora impr3 = new Impresora("Epson WF 2810", R.drawable.epsonwf2810, false, "Láser");
        Impresora impr4 = new Impresora("HP 2630", R.drawable.hp2630, true, "Láser");
        Impresora impr5 = new Impresora("HP 3720", R.drawable.hp3720, true, "Láser");
        Impresora impr6 = new Impresora("HP 3750", R.drawable.hp3750, true, "Tinta");
        Impresora impr7 = new Impresora("HP 5230", R.drawable.hp5230, false, "Láser");

        ArrayList<Impresora> listaImpresoras = new ArrayList<Impresora>();

        listaImpresoras.add(impr1);
        listaImpresoras.add(impr2);
        listaImpresoras.add(impr3);
        listaImpresoras.add(impr4);
        listaImpresoras.add(impr5);
        listaImpresoras.add(impr6);
        listaImpresoras.add(impr7);

        return listaImpresoras;
    }
}
