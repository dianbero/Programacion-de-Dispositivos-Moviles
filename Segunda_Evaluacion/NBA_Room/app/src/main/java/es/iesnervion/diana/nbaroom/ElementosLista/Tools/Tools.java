package es.iesnervion.diana.nbaroom.ElementosLista.Tools;

import java.lang.reflect.Array;
import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.Entities.Jugador;

public class Tools {

    String[] nombres = {"Pepe", "Juanito", "Salva", "Manu", "Rafa", "Jaime", "Juan", "Dani", "Ale", "Luis"};


    public ArrayList<Jugador> listaJugadores(){
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        for (int i=0; i < nombres.length; i++){
            listaJugadores.add(new Jugador(nombres[i], i));
        }
        return listaJugadores;
    }

    
}
