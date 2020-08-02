package es.iesnervion.diana.nbaroom.ElementosLista.Tools;

import java.util.ArrayList;

import es.iesnervion.diana.nbaroom.Entities.Equipo;
import es.iesnervion.diana.nbaroom.Entities.Jugador;

public class Tools {

    String[] nombresJugadores = {"Pepe", "Juanito", "Salva", "Manu", "Rafa", "Jaime", "Juan", "Dani", "Ale", "Luis"};
    String[] nombresEquipos = {"Pamplona", "Bacelona", "Madrid", "Sevilla", "Betis", "Cádiz"};


    public ArrayList<Jugador> listaJugadores(){
        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        for (int i = 0; i < nombresJugadores.length; i++){
            listaJugadores.add(new Jugador(nombresJugadores[i], i));
        }
        return listaJugadores;
    }

    public ArrayList<Equipo> listaEquipos(){
        ArrayList<Equipo> listaEquipos = new ArrayList<>();
        for (int i=0; i < nombresEquipos.length; i++){
            listaEquipos.add(new Equipo(i, nombresEquipos[i]));
        }
        return listaEquipos;
    }

    
}
