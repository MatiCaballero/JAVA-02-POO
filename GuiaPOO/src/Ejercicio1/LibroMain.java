package Ejercicio1;

import Ejercicio1.entidades.Libro;
import Ejercicio1.servicio.servicioLibro;
import java.util.Scanner;

public class LibroMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        servicioLibro sl = new servicioLibro();
        Libro lb = sl.crearLibro();
        sl.mostrarLibro(lb);

    }

}
