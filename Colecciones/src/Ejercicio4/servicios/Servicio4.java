package Ejercicio4.servicios;

import Ejercicio4.comparador.Comparadores;
import Ejercicio4.entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servicio4 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();

    public Pelicula crearPelicula() {

        Pelicula peli = new Pelicula();

        System.out.println("Ingrese el nombre de la pelicula:");
        String titulo = leer.next().toUpperCase();
        peli.setTitulo(titulo);

        System.out.println("Ingrese el director de la pelicula: ");
        String director = leer.next().toUpperCase();
        peli.setDirector(director);

        System.out.println("Ingrese la duracion de la pelicula: (expresado en hora) ");
        Double hora = leer.nextDouble();
        peli.setHora((Double) hora);

        return peli;

    }

    public void agregarPelicula(Pelicula pel) {
        peliculas.add(pel);
    }

    public void mostrarPeliculas() {
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarMayor1hs() {
        System.out.println(" - - - - - - - - - -  - Las peliculas que tienen una duracion mayor a 1hs son: - - - - - - - - - -  - ");

        for (int i = 0; i < peliculas.size(); i++) {
            Pelicula p = peliculas.get(i);

            if (p.getHora() >= 1) {
                System.out.println(p);;
            }
        }
    }

    public void ordenarPorDuracionMayor() {
        System.out.println("- - - - - - - - - -  -  Las peliculas de mayor duracion son: - - - - - - - - - -  - ");

        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMayor);

        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarPorDuracionMenor() {
        System.out.println("- - - - - - - - - -  -  Las peliculas de menor duracion son: - - - - - - - - - -  - ");
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionMenor);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarPorTitulo() {
        System.out.println("- - - - - - - - - -  -  Las peliculas ordenadas por titulo: - - - - - - - - - -  - ");
        Collections.sort(peliculas, Comparadores.ordenarPorTitulo);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void ordenarPorDirector() {
        System.out.println("- - - - - - - - - -  -  Las peliculas ordenadas por Director: - - - - - - - - - -  - ");
        Collections.sort(peliculas, Comparadores.ordenarPorDirector);
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }
}
