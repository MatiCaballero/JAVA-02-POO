package Ejercicio5;

import Ejercicio5.entidades.Pais;
import Ejercicio5.servicios.Servicio5;
import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio5 se = new Servicio5();

        String op;
        op = null;
        do {
            System.out.println("¿Desea agregar un Pais?: (si/no).");
            op = leer.next();
            if (op.equalsIgnoreCase("si")) {
                Pais pa = se.crearPais();
                se.agregarPais(pa);
            }
        } while (op.equalsIgnoreCase("si"));
        se.mostrarPais();
        se.ordenarAlfabetiamente();
        se.eliminarPais();
        
    }
}
