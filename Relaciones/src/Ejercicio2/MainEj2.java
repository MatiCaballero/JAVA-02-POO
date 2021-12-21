package Ejercicio2;

import Ejercicio2.entidades.Juego;
import Ejercicio2.entidades.Jugador;
import Ejercicio2.entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

public class MainEj2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Revolver re = new Revolver();
        //Jugador ju = new Jugador();
        ArrayList <Jugador>jugadores = new ArrayList();
        
//        re.llenarRevolver(re);
//        re.mojar(re);
//        re.siguienteChorro(re);
//        re.muestraPosiciones(re);
        
        System.out.println("¿Cuantos jugadores desea crear?: (1/6)");
        int cantidad = leer.nextInt();
        if (cantidad>6){
            cantidad=6;
        }
        for (int i = 0; i < cantidad; i++) {
            Jugador jug = new Jugador();
            jug.setNombre("Jugador '"+(i+1)+"'");
            jugadores.add(jug);
        }
        Juego juego  = new Juego ();
        juego.llenarJuego(jugadores, re);
        juego.mostrar();
        
        //ju.disparo(re);
        juego.ronda();
    }

}
