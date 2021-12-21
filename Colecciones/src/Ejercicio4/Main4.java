package Ejercicio4;

import Ejercicio4.entidades.Pelicula;
import Ejercicio4.servicios.Servicio4;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Servicio4 se = new Servicio4();

        String op;
        op = null;
        do {
            System.out.println("¿Desea crear una pelicula nueva: (si/no)");
            op = leer.next();
            if (op.equalsIgnoreCase("si")) {
                Pelicula a = se.crearPelicula();
                se.agregarPelicula(a);
            }
        } while (op.equalsIgnoreCase("si"));
        int opciones;
        do {
            System.out.println("Ingrese la opcion que desee: (numeros)");
            System.out.println("1)Mostrar todas las peliculas.");
            System.out.println("2)Mostrar peliculas con duracion  mayor a 1hs.");
            System.out.println("3)Mostrar pelicuas de mayor duracion primero.");
            System.out.println("4)Mostrar peliculas de menor duracion primero.");
            System.out.println("5)Mostrar Peliculas ordenadas alfabeticamente segun su titulo.");
            System.out.println("6)Mostrar Peliculas ordenadas alfabeticamente segun su director.");
            System.out.println("7)Salir.");
            opciones = leer.nextInt();
            switch (opciones) {
                case (1):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.mostrarPeliculas();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (2):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.mostrarMayor1hs();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (3):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.ordenarPorDuracionMayor();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (4):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.ordenarPorDuracionMenor();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (5):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.ordenarPorTitulo();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                case (6):
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    se.ordenarPorDirector();
                    System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
                    break;
                default:
                    System.out.println("Ingreso una opcion incorrecta, vuelva a intentar.");

            }
        } while (opciones != 7);
//        se.mostrarPeliculas();
//        se.mostrarMayor1hs();
//        se.ordenarPorDuracionMayor();
//        se.ordenarPorDuracionMenor();
//        se.ordenarPorTitulo();
//        se.ordenarPorDirector();
    }

}
