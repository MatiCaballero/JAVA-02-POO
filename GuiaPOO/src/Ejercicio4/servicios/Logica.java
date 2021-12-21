package Ejercicio4.servicios;

import Ejercicio4.entidades.DefRectangulo;
import java.util.Scanner;

public class Logica {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public DefRectangulo rectagulo() {
        System.out.println("Ingrese Base del rectangulo:");
        int base = leer.nextInt();
        System.out.println("Ingrese Altura del rectangulo: ");
        int altura = leer.nextInt();
        DefRectangulo d = new DefRectangulo(base, altura);
        System.out.println("Base de rectangulo: " + base + ". Altura de rectangulo: " + altura);
        return (d);
    }

    public void superficie(DefRectangulo s) {
        int superficie = s.getAltura() * s.getBase();
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void perimetro(DefRectangulo p) {
        int perimetro = (p.getAltura() + p.getBase()) * 2;
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujo(DefRectangulo d) {
        if (d.getAltura() == d.getBase()) {
            for (int i = 0; i < d.getBase(); i++) {
                System.out.print("*");
            }

            System.out.println(" ");
            
            
            for (int i = 0; i < d.getBase() - 2; i++) {
                System.out.print("*");
                for (int j = 0; j < d.getAltura() - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
            
            
            for (int i = 0; i < d.getBase(); i++) {
                System.out.print("*");
            }
        }
        else {
            for (int i = 0; i < d.getBase(); i++) {
                System.out.print("*");
            }
            System.out.println(" ");

            for (int i = 0; i < d.getBase() - d.getAltura(); i++) {
                System.out.print("*");
                for (int j = 0; j < d.getAltura() +2 ; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            for (int i = 0; i < d.getBase(); i++) {
                System.out.print("*");
            }
        }
    }
}
