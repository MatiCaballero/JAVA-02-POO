package Ejercicio3;

import Ejercicio3.entidades.Baraja;
import Ejercicio3.entidades.Carta;
import Ejercicio3.servicioBaraja.ServicioBaraja;
import java.util.Scanner;

public class MainEjercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Carta ca = new Carta();
        Baraja ba = new Baraja();
        ServicioBaraja sb = new ServicioBaraja();
        
        ba.llenarMazo();
        int opcion;

        do {
            System.out.println("Ingrese el comando que desee realizar:");
            System.out.println("1) Barajar mazo.");
            System.out.println("2) Mostrar  siguiente carta.");
            System.out.println("3) Dar un n°/cantidad  de  cartas.");
            System.out.println("4) Mostrar descarte (cartas que ya salieron).");
            System.out.println("5) Mostrar baraja.");
            System.out.println("6) Salir.");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1: ba.barajar();
                break;
                case 2: ba.siguienteCarta();
                break;
                case 3: ba.darCartas();
                break;
                case 4: ba.cartasMonton();
                break;
                case 5: ba.mostrar();
            }
                   
        }
        while (opcion != 6) ;
                

        }


    
    }
