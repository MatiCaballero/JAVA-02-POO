package Ejercicio3.servicios;

import Ejercicio3.entidades.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class Servicios3 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos = new ArrayList();

    public Alumno crearAlumno() {

        Alumno alu = new Alumno();

        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next().toUpperCase();
        alu.setNombre(nombre);

        System.out.println("Ingrese la nota 1.");
        int nota1 = leer.nextInt();
        System.out.println("Ingrese la nota 2.");
        int nota2 = leer.nextInt();
        System.out.println("Ingrese la nota 3.");
        int nota3 = leer.nextInt();

        alu.getNota().add(nota1);
        alu.getNota().add(nota2);
        alu.getNota().add(nota3);

        System.out.println("Las  notas de: " + nombre + " son: ");

        for (Object aux : alu.getNota()) {
            System.out.println(aux);
        }
        return alu;
    }

    public void agregarAlumno(Alumno al){
    alumnos.add(al);
    }

    public void notaFinal() {
        System.out.println("Ingrese el nombre del alumno que quiere calcular su nota final: ");
        String nomb = leer.next().toUpperCase();

        int suma = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alu = alumnos.get(i);
            if (alu.getNombre().equalsIgnoreCase(nomb)) {
                for (int j = 0; j < alu.getNota().size(); j++) {
                    suma = suma + alu.getNota().get(j);
                }
            }
        }
        System.out.println("La nota final es: " + suma/3);

    }
}
