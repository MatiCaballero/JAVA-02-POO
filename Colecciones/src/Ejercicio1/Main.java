package Ejercicio1;

import Ejercicio1.entidades.Perros;
import Ejercicio1.servicios.Servicio1;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio1 s = new Servicio1();
        s.crear();
        s.mostrarRaza();
        s.recorrerEliminar();
    }

}
