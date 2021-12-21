package Ejercicio2.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private Revolver revolver;

    public Juego() {
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + '}';
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {
        this.jugadores = jugadores;
        this.revolver = r;

    }

    public void mostrar() {
        for (Jugador aux : jugadores) {
            System.out.println(aux.getNombre());
        }

    }

    public void ronda() {
        Revolver r = new Revolver();
        r.llenarRevolver(r);

        for (Jugador aux : jugadores) {
            System.out.println("- - - - - - Dispara: " + aux.getNombre() + " - - - - - -");
            r.siguienteChorro(r);
            if (r.mojar(r) == true) {
                System.out.println("");
                System.out.println("X_X ! ! ! El jugador: " + aux.getNombre() + " se mojó ! ! ! X_X");
                System.out.println("");
                break;
            }
        }
    }
}
