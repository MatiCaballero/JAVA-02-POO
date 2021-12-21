package Ejercicio9;

import Ejercicio9.entidades.Matematica;
import Ejercicio9.servicios.ServicioEj9;
import java.util.Scanner;

public class MainEj9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioEj9 se = new ServicioEj9();
        Matematica m = se.crearObjeto();
        int opc;

        do {
            System.out.println("Elija una opcion:.");
            System.out.println("1) Mostrar el mayor numero. ");
            System.out.println("2) Elevar el numero mayor sobre el numero menor.");
            System.out.println("3) Raiz cuadrada del menor numero.");
            System.out.println("4) Salir.");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    System.out.println(" * * * * * * * * ");
                    System.out.println("");
                    se.devolverMayor(m);
                    System.out.println("");
                    System.out.println(" * * * * * * * * ");
                    break;
                case 2:
                    System.out.println(" * * * * * * * * ");
                    System.out.println("");
                    se.calcularPotencia(m);
                    System.out.println("");
                    System.out.println(" * * * * * * * * ");
                    break;
                case 3:
                    System.out.println(" * * * * * * * * ");
                    System.out.println("");
                    se.calculaRaiz(m);
                    System.out.println("");
                    System.out.println(" * * * * * * * * ");
                    break;
            }
        } while (opc != 4);

    }
}
