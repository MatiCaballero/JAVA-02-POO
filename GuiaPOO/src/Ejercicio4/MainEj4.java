package Ejercicio4;

import Ejercicio4.entidades.DefRectangulo;
import Ejercicio4.servicios.Logica;
import java.util.Scanner;

public class MainEj4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Logica l = new Logica();
        DefRectangulo dr = l.rectagulo();
        l.perimetro(dr);
        l.superficie(dr);
        l.dibujo(dr);
    }

}
