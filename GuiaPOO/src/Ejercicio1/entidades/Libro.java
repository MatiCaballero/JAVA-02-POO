
package Ejercicio1.entidades;

import java.util.Scanner;

public class Libro {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int isbn;
    private String titulo;
    private String autor;
    private int npaginas;

    //Constructor vacio.
    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int npaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.npaginas = npaginas;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return " " + "ISBN = " + isbn + ", Titulo del libro = " + titulo + ", Autor = " + autor + ", Numero de paginas =" + npaginas + '}';

}
}
