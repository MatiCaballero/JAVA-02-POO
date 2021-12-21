package Ejercicio1.servicio;

import Ejercicio1.entidades.Libro;
import java.util.Scanner;

public class servicioLibro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {

        System.out.println("Ingrese el ISPN del libro: ");
        int isbn = leer.nextInt();
        System.out.println("Ingrese el Titulo del libro: ");
        String titulo = leer.next();
        System.out.println("Ingrese el nombre del autor del libro: ");
        String autor = leer.next();
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        int npaginas = leer.nextInt();
        return new Libro(isbn, titulo, autor, npaginas);
    }

    public void mostrarLibro(Libro l) {
        System.out.println("El numero de ISBN es: " + l.getIsbn());
        System.out.println("El titulo del libro es: " + l.getTitulo());
        System.out.println("El nombre del autor es: " + l.getAutor() );
        System.out.println("La cantidad de paginas que contiene el libro: " + l.getNpaginas() );

    }
}
